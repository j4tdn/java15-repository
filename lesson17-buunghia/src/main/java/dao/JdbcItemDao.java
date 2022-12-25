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
import persistence.Item;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs ;
	
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<Item> getItemWithOrderDate(LocalDate ld) {
		List<Item> result = new ArrayList<>();
		String sql = "SELECT mh.MaMH,mh.TenMH, dh.ThoiGianDatHang \n"
					+ "FROM DonHang dh\n"
					+ "JOIN ChiTietDonHang ctdh\n"
					+ "ON dh.MaDh = ctdh.MaDh\n"
					+ "JOIN Mathang mh\n"
					+ "ON mh.MaMh = ctdh.MaMh\n"
					+ "WHERE DATE(dh.ThoiGianDatHang) = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setDate(1, Date.valueOf(ld));
			rs = pst.executeQuery();
			while (rs.next()) {
				Item item = new Item(
						rs.getInt("MaMH"),
						rs.getString("TenMH"),
						ld);
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
				
		return result;
	}
}
