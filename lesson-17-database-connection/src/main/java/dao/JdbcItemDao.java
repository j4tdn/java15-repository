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
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao{
	private Connection connection;
	//private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	public JdbcItemDao() {
		// TODO Auto-generated constructor stub
		connection = DbConnection.getConnection();
		
	}
	public List<Item> getItems(String igName){
		List<Item> result = new ArrayList<>();
		String sql = ""
				+ "SELECT *\n"
				+ " FROM mathang mh \n"
				+ " JOIN loaihang lh \n"
				+ " ON mh.MaLH = lh.MaLH\n"
				+ "WHERE lh.TenLH LIKE ?";
		
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, "%" +igName +"%");
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				Item item = new Item(
						rs.getInt("MaMH"), 
						rs.getString("TenMH"),
						rs.getString("MauSac"),
						ig
						);
				result.add(item);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			SqlUtils.close(rs, pst);
		}
		
				
		return result;
	}
	
	public List<Item> getAll(){
		List<Item> result = new ArrayList<>();
		String sql = ""
				+ "SELECT *\n"
				+ " FROM mathang mh \n"
				+ " JOIN loaihang lh \n"
				+ " ON mh.MaLH = lh.MaLH";
				
		
		try {
			pst = connection.prepareStatement(sql);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				Item item = new Item(
						rs.getInt("MaMH"), 
						rs.getString("TenMH"),
						rs.getString("MauSac"),
						ig
						);
				result.add(item);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			SqlUtils.close(rs, pst);
		}
		
				
		return result;
	}
	

}
