package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

import persistence.transformer.ItemGroupTransformer;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {
private final Connection conn;
private Statement st;
private PreparedStatement pst;
private ResultSet rs;

public JdbcItemGroupDao() {
	conn = DbConnection.getConnection();
	
}
   private static final String GET_ITEM_GROUPS = ""
   		+ "WITH ThongTinMatHang AS	(\n"
   		+ "     SELECT mh.MaMH,mh.TenMH,\n"
   		+ "     SUM(ctmh.SoLuong) SoLuong\n"
   		+ "      ,lh.*\n"
   		+ "      FROM loaihang lh\n"
   		+ "      JOIN mathang mh\n"
   		+ "      ON mh.MaLH = lh.MaLH\n"
   		+ "      JOIN chitietmathang ctmh\n"
   		+ "      ON ctmh.MaMH = mh.MaMH\n"
   		+ "      GROUP BY mh.MaMH\n"
   		+ ")\n"
   		+ "SELECT ttmh.MaLH,\n"
   		+ " ttmh.TenLH,\n"
   		+ " SUM(ttmh.SoLuong) SoLuong,\n"
   		+ " GROUP_CONCAT(concat(ttmh.MaMh,'-',ttmh.TenMH,'-',ttmh.SoLuong)) DanhSachMatHang \n" 
   		+ " FROM ThongTinMatHang ttmh\n"
   		+ " GROUP BY ttmh.MaLH;\n";
   	
	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM loaihang";
		try {
			st = conn.createStatement();
		rs=	st.executeQuery(sql);
			
		while(rs.next()) {
			ItemGroup ig = new ItemGroup(
					rs.getInt("MaLH"),
					rs.getString("TenLH"));
			
			result.add(ig);
			
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			SqlUtils.close(rs,st);
			
		}
		
		
		return result;
	}
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
	//	String sql = "SELECT * FROM LoaiHang WHERE TenLH = '" + name +"'";
		String sql = "SELECT * FROM LoaiHang WHERE TenLH = ?";
		try {
		//	st = conn.createStatement();
			pst = conn.prepareStatement(sql);
			pst.setString(1, name );
			//rs = st.executeQuery(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
			ItemGroup	ig = new ItemGroup(
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
		// TODO Auto-generated method stub
		
		try {
			st = conn.createStatement();
		rs=	st.executeQuery(GET_ITEM_GROUPS);
			
		while(rs.next()) {
	  result.add(ItemGroupTransformer.transform(rs));
			
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			SqlUtils.close(rs,st);
			
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
	public void update(ItemGroup itemGroup) {
		String sql = ""
				+ "UPDATE LoaiHang\n"
				+ "  SET TenLH = ?\n"
				+ "WHERE MaLH = ?";
				
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
	@Override
		public void update(List<ItemGroup> itemGroups) {
		
			
		}
	
	

	

}
