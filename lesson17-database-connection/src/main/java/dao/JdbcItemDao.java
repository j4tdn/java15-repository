package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemGroup;

public class JdbcItemDao implements ItemDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<Item> getItems(String igName) {
		List<Item> result = new ArrayList<>();
		
		String sql = ""
				+ "SELECT *\n"
				+ "FROM MatHang mh \n"
				+ "JOIN LoaiHang LH \n"
				+ "ON mh.MaMH = lh.MaLH\n"
				+ "WHERE lh.TenLH LIKE ?";
		try {
			pst= connection.prepareStatement(sql);
			pst.setString(1, "%" + igName + "%");
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				Item item = new Item(
						rs.getInt("MaMH"),
						rs.getString("TenMH"),
						rs.getString("MauSac"), ig);
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Item> getAll() {
		List<Item> result = new ArrayList<>();
		
		String sql = ""
				+ "SELECT *\n"
				+ "FROM MatHang mh \n"
				+ "JOIN LoaiHang LH \n"
				+ "ON mh.MaMH = lh.MaLH\n";
		try {
			pst= connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				Item item = new Item(
						rs.getInt("MaMH"),
						rs.getString("TenMH"),
						rs.getString("MauSac"), ig);
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
