package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao {
	private final Connection conn;
//	private Statement st; // wrapper wrap sql --> run sql in dbms
	// full sql without parameters , sql injection
	private PreparedStatement pst; // passing parameters into sql
	private ResultSet rs; // temporary table after execute querry

	public JdbcItemDao() {
		conn = DbConnection.getConnection();
	}

	@Override
	public List<Item> getItems(String igName) {
		List<Item> result = new ArrayList<Item>();
		String sql = "SELECT *\n" + "FROM MatHang mh \n" + "JOIN Loaihang lh \n" + "ON mh.MaLH = lh.MaLH \n"
				+ "WHERE lh.TenLH like ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "%" + igName + "%");
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getString("MauSac"), ig);
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs);
		}

		return result;
	}

	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		List<Item> result = new ArrayList<Item>();
		String sql = "SELECT *\n" + "FROM MatHang mh \n" + "JOIN Loaihang lh \n" + "ON mh.MaLH = lh.MaLH \n";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				Item item = new Item(rs.getInt("MaMH"), rs.getString("TenMH"), rs.getString("MauSac"), ig);
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs);
		}
		return result;
	}
}
