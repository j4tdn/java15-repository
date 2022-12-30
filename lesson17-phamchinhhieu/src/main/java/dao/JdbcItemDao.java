package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemDto;
import persistence.ItemDtoByIG;
import persistence.ItemGroup;

public class JdbcItemDao implements ItemDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<ItemDto> getItemsbyDate(LocalDate deliveryOrder) {
		List<ItemDto> result = new ArrayList<>();
		String sql = ""
				+ "select mh.MaMH, mh.TenMH, TIME(dh.ThoiGianDatHang) ThoiGianDatHang from donhang dh \r\n"
				+ "join chitietdonhang ctdh \r\n"
				+ "on ctdh.MaDH = dh.MaDH\r\n"
				+ "join mathang mh\r\n"
				+ "on mh.MaMH = ctdh.MaMH\r\n"
				+ "where Date(dh.ThoiGianDatHang) = ?";
		try {
			pst= connection.prepareStatement(sql);
			pst.setDate(1, Date.valueOf(deliveryOrder));
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemDto item = new ItemDto(rs.getInt("MaMH"), 
						rs.getString("TenMH"),
						rs.getTime("ThoiGianDatHang").toLocalTime());
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<ItemDto> getTop3Items(Integer year) {
		List<ItemDto> result = new ArrayList<ItemDto>();
		String sql = ""
				+ "select mh.MaMH, MH.TenMH, sum(SoLuong) SoLuong from mathang mh \r\n"
				+ "join chitietdonhang ctdh\r\n"
				+ "on ctdh.MaMH = mh.MaMH\r\n"
				+ "join donhang dh \r\n"
				+ "on dh.MaDH = ctdh.MaDH\r\n"
				+ "where year(dh.ThoiGianDatHang) = ?\r\n"
				+ "group by mh.MaMH\r\n"
				+ "order by SoLuong desc\r\n"
				+ "limit 3";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, year);
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemDto item = new ItemDto(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getInt("SoLuong"));
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	@Override
	public List<ItemDtoByIG> getItemsByIG() {
		List<ItemDtoByIG> result = new ArrayList<ItemDtoByIG>();
		String sql = ""
				+ "with ThongTinMatHang as(           \r\n"
				+ "	select mh.*, GiaBan from loaihang lh \r\n"
				+ "    join mathang mh on\r\n"
				+ "    lh.MaLH = mh.MaLH\r\n"
				+ "    join chitietmathang ctmh\r\n"
				+ "    on mh.MaMH = ctmh.MaMH\r\n"
				+ "    ),\r\n"
				+ "    GiaBanCaoNhat as(\r\n"
				+ "    select MaLH,max(GiaBan) GiaBanCaoNhat\r\n"
				+ "    from ThongTinMatHang\r\n"
				+ "    group by MaLH\r\n"
				+ "    )\r\n"
				+ "    select ttmh.* from ThongTinMatHang ttmh\r\n"
				+ "    join GiaBanCaoNhat gbcn on\r\n"
				+ "    ttmh.GiaBan = gbcn.GiaBanCaoNhat\r\n"
				+ "    and ttmh.MaLH = gbcn.MaLH";
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemDtoByIG item = new ItemDtoByIG(
						rs.getInt("MaMH"),
						rs.getString("TenMH"),
						rs.getString("MauSac"),
						new ItemGroup(rs.getInt("MaLH"), null), rs.getInt("GiaBan"));
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	

	

}
