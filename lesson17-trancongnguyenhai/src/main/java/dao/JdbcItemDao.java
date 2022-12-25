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
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao{
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcItemDao() {
		conn = DbConnection.getConnection();
	}
	
	@Override
	public List<ItemDto> listOrderInDay(LocalDate date) {
		String sql = ""
				+ "SELECT mh.MaMH,\n"
				+ "	   mh.TenMH,\n"
				+ "       dh.ThoiGianDatHang ThoiGianDatHang\n"
				+ "  FROM mathang mh\n"
				+ "  JOIN chitietdonhang ctdh\n"
				+ "    ON mh.MaMH = ctdh.MaMH\n"
				+ "  JOIN donhang dh\n"
				+ "    ON ctdh.MaDH = dh.MaDH\n"
				+ " WHERE dh.ThoiGianDatHang LIKE '%?%';";
		List<ItemDto> result = new ArrayList<>();
		try {
			pst = conn.prepareStatement(sql);
			pst.setDate(1, DateUtils.toSDate(date));
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemDto item = new ItemDto(
							rs.getInt("MaMH"),
							rs.getString("TenMH"),
							rs.getDate("ThoiGianDatHang").toLocalDate()
						);
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return null;
	}
	
	@Override
	public List<String> topItemInYear(int year) {
		
		return null;
	}
}
