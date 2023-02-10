package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs ;
	
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	@Override
	public List<Item> getAll() {
		List<Item> result = new ArrayList<>();
		String sql = "SELECT * \n"
				+ "FROM MatHang mh\n"
				+ "JOIN LoaiHang lh\n"
				+ "ON mh.MaLH = lh.MaLH;";
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(new Item(
						rs.getInt("MaMH"),
						rs.getString("TenMH"),
						rs.getString("MauSac"),
						new ItemGroup(
								rs.getInt("MaLH"),
								rs.getString("TenLH"))
						));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	@Override
	public List<Item> getItemWithOrderTime(LocalDate ld) {
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
				LocalTime lt = rs.getTimestamp("ThoiGianDatHang").toLocalDateTime().toLocalTime();
				Item item = new Item(
						rs.getInt("MaMH"),
						rs.getString("TenMH"),
						lt);
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
