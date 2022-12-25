package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import dto.ItemDto;
import dto.ItemGroupDto;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	private static final String GET_ITEMS_GROUPS = ""
			+ "SELECT lh.*, group_concat(concat(mh.TenMH, \"-\", ctmh.MaKC , \"-\", ctmh.SoLuong)) DanhSachMatHang, sum(ctmh.SoLuong) TongSoLuong \n"
			+ "FROM loaihang lh\n"
			+ "JOIN mathang mh\n"
			+ "ON lh.MaLH = mh.MaLH\n"
			+ "JOIN chitietmathang ctmh\n"
			+ "ON mh.MaMH = ctmh.MaMH\n"
			+ "GROUP BY lh.MaLH";
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}
	@Override
	public List<ItemGroupDto> getItemGroups() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(GET_ITEMS_GROUPS);
			rs = pst.executeQuery();
			while(rs.next())
			{
				ItemGroupDto itemGroup = new ItemGroupDto(rs.getInt("MaLH"),
										   rs.getString("TenLH"), 
										   rs.getString("DanhSachMatHang"),
										   rs.getInt("TongSoLuong"));
				result.add(itemGroup);
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
