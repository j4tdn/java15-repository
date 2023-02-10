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
import persistence.ItemGroupRawData;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao{
	
	private final Connection connection;
	private Statement st; // wrapper wrap sql --> run sql in dbms
						  // full sql without parameters, sql injection
	private PreparedStatement pst; //passing parameters into sql 
	private ResultSet rs; // temporary table after execute query
 	
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}
	
	private static final String GET_ITEM_GROUPS = ""
			+ "WITH ThongTinMatHang AS (\n"
			+ "	SELECT mh.MaMH,\n"
			+ "		   mh.TenMH,\n"
			+ "           SUM(ctmh.SoLuong) SoLuong,\n"
			+ "           lh.*\n"
			+ "	FROM LoaiHang lh\n"
			+ "    JOIN MatHang mh\n"
			+ "    ON   lh.MaLH = mh.MaLH\n"
			+ "    JOIN ChitietMatHang ctmh\n"
			+ "    ON 	 mh.MaMH = ctmh.MaMH\n"
			+ "    GROUP BY mh.MaMH\n"
			+ ")\n"
			+ "SELECT ttmh.MaLH,\n"
			+ "	   ttmh.TenLH,\n"
			+ "       SUM(ttmh.SoLuong) TongSoLuong,\n"
			+ "       GROUP_CONCAT(concat(ttmh.TenMH, \"-\", ttmh.SoLuong)) DanhSachMatHang\n"
			+ "FROM ThongTinMatHang ttmh\n"
			+ "GROUP BY ttmh.MaLH";
	
	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		// B1: Write down a native query --> db(true)
		String sql = "SELECT * FROM LoaiHang ";
		try {
			st = connection.createStatement();
			// B2: SELECT --> executeQuery
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(
									rs.getInt("MaLH"),
									rs.getString("TenLH"));
				result.add(ig);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		
		
		return result;
	}
	@Override
	public List<ItemGroupRawData> getItemGroups() {
		List<ItemGroupRawData> result = new ArrayList<>();
		// B1: Write down a native query --> db(true)
		try {
			st = connection.createStatement();
			// B2: SELECT --> executeQuery
			rs = st.executeQuery(GET_ITEM_GROUPS);
			while(rs.next()) {
				ItemGroupRawData rawData = new ItemGroupRawData(
						rs.getInt("MaLH"),
						rs.getString("TenLH"),
						rs.getInt("SoLuong"),
						rs.getString("DanhSachMatHang")
						);
				result.add(rawData);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		return result;
	}
	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		// B1: Write down a native query --> db(true)
		String sql = "SELECT * FROM LoaiHang WHERE MaLH = " + id;
		try {
			st = connection.createStatement();
			// B2: SELECT --> executeQuery
			rs = st.executeQuery(sql);
			if(rs.next()) {
				result = new ItemGroup(
									rs.getInt("MaLH"),
									rs.getString("TenLH"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		
		
		return result;
	}
	@Override
	public List<ItemGroup> search(String name) {
		List<ItemGroup> result = new ArrayList<>();
		// B1: Write down a native query --> db(true)
//		String sql = "SELECT * FROM LoaiHang WHERE TenLH = '" + name + "'"; // sql injection
		String sql = "SELECT * FROM LoaiHang WHERE TenLH = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, name);
			// B2: SELECT --> executeQuery
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(
						rs.getInt("MaLH"),
						rs.getString("TenLH"));
				result.add(ig);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs,st);
		}
		
		
		return result;
	}
	@Override
	public void save(ItemGroup itemGroup) {
		// B1: Write down a native query --> db(true)
		String sql = "INSERT INTO LoaiHang(MaLH,TenLH) VALUES (?,?)";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			// B2: SELECT --> executeQuery
			
			// return int: đây là số dòng bị ảnh hưởng
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		
		
	}
	@Override
	public void save(List<ItemGroup> itemGroups) {
		// B1: Write down a native query --> db(true)
				String sql = "INSERT INTO LoaiHang(MaLH,TenLH) VALUES (?,?)";
				int countBatch = 0;
				try {
					pst = connection.prepareStatement(sql);
					for (ItemGroup itemGroup : itemGroups )
					{
						pst.setInt(1, itemGroup.getId());						
						pst.setString(2, itemGroup.getName());
						
						pst.addBatch();
						if(++countBatch % 100 == 0)
						{
							pst.executeBatch();
						}
					}
					int[] affectedRows = pst.executeBatch();
					System.out.println(">>>" + Arrays.toString(affectedRows));
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					SqlUtils.close(pst);
				}
		
	}
	@Override
	public void update(ItemGroup itemGroup) {
		String sql =  "UPDATE LoaiHang \n"
					+ "SET TenLH = ?\n"
					+ "WHERE MaLH = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, itemGroup.getName());
			pst.setInt(2, itemGroup.getId());
			// B2: SELECT --> executeQuery
			
			// return int: đây là số dòng bị ảnh hưởng
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		
	}
	@Override
	public void update(List<ItemGroup> itemGroups) {
		
	}
	
}
