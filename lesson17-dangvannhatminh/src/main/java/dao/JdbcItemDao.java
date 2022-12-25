package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import dto.ItemDto;
import dto.ItemDtoByIG;
import persistence.ItemGroup;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao {
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	private static final String GET_ITEMS_DATE = ""
			+ "SELECT mh.MaMH, mh.TenMH, TIME(dh.ThoiGianDatHang) ThoiGianDatHang\n"
			+ "FROM mathang mh \n"
			+ "JOIN chitietdonhang ctdh\n"
			+ "ON mh.MaMH = ctdh.MaMH\n"
			+ "JOIN donhang dh\n"
			+ "ON ctdh.MaDH = dh.MaDH\n"
			+ "WHERE DATE(ThoiGianDatHang) = ? ";
	private static final String GET_TOP3_ITEMS = ""
			+ "SELECT mh.MaMH, mh.TenMH, SUM(ctmh.SoLuong) TongSoLuong\n"
			+ "FROM mathang mh\n"
			+ "JOIN chitietmathang ctmh\n"
			+ "ON mh.MaMH = ctmh.MaMH\n"
			+ "JOIN chitietdonhang ctdh\n"
			+ "ON ctmh.MaMH = ctdh.MaMH\n"
			+ "AND ctmh.MaKC = ctdh.MaKC\n"
			+ "JOIN donhang dh\n"
			+ "ON ctdh.MaDH = dh.MaDH\n"
			+ "WHERE year(dh.ThoiGianDatHang) = ? \n"
			+ "GROUP BY mh.MaMH\n"
			+ "limit 3";
	private static final String GET_ITEMS_GROUPBY_IG = ""
			+ "WITH ThongTinMatHang AS (\n"
			+ "SELECT mh.*, ctmh.GiaBan\n"
			+ "FROM LoaiHang lh\n"
			+ "JOIN mathang mh\n"
			+ "ON lh.MaLH = mh.MaLH\n"
			+ "JOIN chitietmathang ctmh\n"
			+ "ON mh.MaMH = ctmh.MaMH\n"
			+ ")\n"
			+ ", ThongTinSoLuong AS (\n"
			+ "SELECT MaLH, TenMH, max(GiaBan) GiaBan\n"
			+ "FROM ThongTinMatHang\n"
			+ "GROUP BY MaLH\n"
			+ ")\n"
			+ "SELECT ttmh.MaMH, ttmh.TenMH, ttmh.MauSac, ttsl.MaLH, ttsl.GiaBan\n"
			+ "FROM ThongtinMatHang ttmh\n"
			+ "JOIN ThongTinSoLuong ttsl\n"
			+ "ON ttmh.MaLH = ttsl.MaLH\n"
			+ "AND ttmh.GiaBan = ttsl.GiaBan";
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	@Override
	public List<ItemDto> getItems(LocalDate lDate) {
		List<ItemDto> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_ITEMS_DATE);
			pst.setDate(1, DateUtils.toSDate(lDate));
			rs = pst.executeQuery();
			while(rs.next())
			{
				ItemDto item = new ItemDto(rs.getInt("MaMH"),
										   rs.getString("TenMH"), 
										   DateUtils.toST(rs.getTime("ThoiGianDatHang")));
				result.add(item);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return null;
	}
	@Override
	public List<ItemDto> getTopThreeItemByYear(int year) {
		List<ItemDto> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_TOP3_ITEMS);
			Year y = Year.of(year);
			pst.setInt(1, y.getValue());
			rs = pst.executeQuery();
			while(rs.next())
			{
				ItemDto item = new ItemDto(rs.getInt("MaMH"),
										   rs.getString("TenMH"), 
										   rs.getInt("TongSoLuong"));
				result.add(item);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return null;
	}
	@Override
	public List<ItemDtoByIG> getItemsGroupByItemGroup() {
		List<ItemDtoByIG> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_ITEMS_GROUPBY_IG);
			rs = pst.executeQuery();
			while(rs.next())
			{
				ItemDtoByIG item = new ItemDtoByIG(rs.getInt("MaMH"),
										   rs.getString("TenMH"), 
										   rs.getString("MauSac"),
										   new ItemGroup(rs.getInt("MaLH"),null),
										   rs.getDouble("GiaBan"));
				result.add(item);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,pst);
		}
		return null;
	}
}
