package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.transformer.ItemGroupTransformer;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao{

	private final Connection conn;
	
	// wrapper wrap sql --> run sql in dbms
	private Statement st;  // full sql without parameters, sql injection
	private PreparedStatement pst; // passing parameters into sql
	
	private ResultSet rs; // temporary table after execute query
	
	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	private static final String GET_ITEM_GROUPS = ""
			+ "WITH ThongTinMatHang AS (\n" + 
			"	SELECT mh.MaMH,\n" + 
			"		   mh.TenMH,\n" + 
			"		   SUM(ctmh.SoLuong) SoLuong,\n" + 
			"		   lh.*\n" + 
			"	  FROM LoaiHang lh\n" + 
			"	  JOIN MatHang mh\n" + 
			"		ON lh.MaLH = mh.MaLH\n" + 
			"	  JOIN ChiTietMatHang ctmh\n" + 
			"		ON mh.MaMH = ctmh.MaMH\n" + 
			"	GROUP BY mh.MaMH\n" + 
			")\n" + 
			"SELECT ttmh.MaLH,\n" + 
			"	    ttmh.TenLH,\n" + 
			"       SUM(ttmh.SoLuong) SoLuong,\n" + 
			"       GROUP_CONCAT(concat(ttmh.MaMH, '-', ttmh.TenMH, '-', ttmh.SoLuong)) DanhSachMatHang\n" + 
			"  FROM ThongTinMatHang ttmh\n" + 
			"  GROUP BY ttmh.MaLH";
	
	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		// B1: Write down a native query --> db(true)
		String sql = "SELECT * FROM LoaiHang";
		try {
			st = conn.createStatement();
			
			// B2: SELECT --> executeQuery
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(
						rs.getInt("MaLH"), 
						rs.getString("TenLH")
				);
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public List<ItemGroupDto> getItemGroups() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(GET_ITEM_GROUPS);
			while(rs.next()) {
				result.add(ItemGroupTransformer.transform(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		String sql = "SELECT * FROM LoaiHang WHERE MaLH = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				result = new ItemGroup(
						rs.getInt("MaLH"), 
						rs.getString("TenLH")
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public List<ItemGroup> search(String name) {
		List<ItemGroup> result = new ArrayList<>();
		// String sql = "SELECT * FROM LoaiHang WHERE TenLH = '" + name + "'";
		String sql = "SELECT * FROM LoaiHang WHERE TenLH = ?";
		try {
			// st = conn.createStatement();
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			// rs = st.executeQuery(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(
						rs.getInt("MaLH"), 
						rs.getString("TenLH")
				);
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public void save(ItemGroup itemGroup) {
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)\n"
				   + "VALUES(?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	/*
	    86881, Item Group 86881
		86882, Item Group 86882
		86883, Item Group 86883
		86884, Item Group 86884
		86885, Item Group 86885
	 */
	@Override
	public void save(List<ItemGroup> itemGroups) {
		// itemGroups --> 925
		// JAVA: pst's batch_size --> 925
		// SQL : 925 batches --> execute
		// update
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)\n"
				   + "VALUES(?, ?)";
		int batchCount = 0;
		try {
			pst = conn.prepareStatement(sql);
			for (ItemGroup itemGroup: itemGroups) {
				// update
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
				if(++batchCount % 100 == 0) {
					pst.executeBatch();
				}
			}
			int[] affectedRows = pst.executeBatch();
			System.out.println(">>> affectedRows >>>" + Arrays.toString(affectedRows));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void update(ItemGroup itemGroup) {
		String sql = ""
				+ "UPDATE LoaiHang\n"
				+ "   SET TenLH = ?\n"
				+ " WHERE MaLH = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, itemGroup.getName());
			pst.setInt(2, itemGroup.getId());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
}
