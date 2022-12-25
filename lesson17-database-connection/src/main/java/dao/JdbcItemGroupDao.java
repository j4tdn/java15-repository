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
import persistence.ItemDetail;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.transformer.ItemGroupTransformer;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {
	private final Connection conn;
	private Statement st; // wrapper wrap sql --> run sql in dbms
	// full sql without parameters , sql injection
	private PreparedStatement pst; // passing parameters into sql
	private ResultSet rs; // temporary table after execute querry

	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
    private static final String GET_ITEM_GROUPS = "" + "WITH ThongTinMatHang AS (\n"
			+ "SELECT mh.MaMH,\n"
			+ "       mh.TenMH,\n"
			+ "       sum(ctmh.SoLuong) SoLuong,\n"
			+ "       lh.*\n"
			+ "	FROM LoaiHang lh\n"
			+ "    JOIN MatHang mh\n"
			+ "    ON mh.MaLH = lh.MaLH\n"
			+ "    JOIN ChiTietMatHang ctmh\n"
			+ "    ON mh.MaMH = ctmh.MaMH\n"
			+ "    GROUP BY mh.MaMH )\n"
			+ "    SELECT ttmh.MaLH , ttmh.TenLH , SUM(ttmh.SoLuong) SoLuong, group_concat(ttmh.MaMH,'-',ttmh.TenMH , '-', ttmh.SoLuong) DanhSachMatHang\n"
			+ "    FROM ThongTinMatHang ttmh\n"
			+ "    GROUP BY ttmh.MaLH;";
	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		// B1 : Write down a native query --> database(true)
		String sql = "SELECT * FROM Loaihang";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				result.add(ig);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}

		// B2 : SELECT --> executeQuery

		return result;
	}

	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		// B1 : Write down a native query --> database(true)
		String sql = "SELECT * FROM Loaihang WHERE MaLH = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public void save(ItemGroup itemGroup) {

		// B1 : Write down a native query --> database(true)
		String sql = "INSERT INTO LoaiHang(MaLH,TenLH)\n" + "VALUES(? ,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}

	@Override
	public List<ItemGroup> search(String name) {
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		 String sql = "SELECT * FROM LoaiHang Where TenLH = '" + name + "'";
		//String sql = "SELECT * FROM LoaiHang WHERE TenLH = ?";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				result.add(ig);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public void store(ItemDetail itemDetail) {
		// B1 : write a native querry
		String sql = "INSERT INTO CHITIETDONHANG(MaDH,MaMH,MaKC,SoLuong) \n" + "VALUES(?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemDetail.getOrderId());
			pst.setInt(2, itemDetail.getItemId());
			pst.setString(3, itemDetail.getSizeId());
			pst.setInt(4, itemDetail.getQuantity());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}

	}

	@Override
	public void update(ItemGroup itemGroup) {
		// B1 : Write down a native query --> database(true)
		String sql = "" + "UPDATE LoaiHang\n" + "SET TenLH = ?\n" + "WHERE MaLH =?";
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
	public List<ItemGroupDto> getItemGroups() {
		List<ItemGroupDto> result = new ArrayList<>();
		// B1 : Write down a native query --> database(true)
		try {
			st = conn.createStatement();
			rs = st.executeQuery(GET_ITEM_GROUPS);
			while (rs.next()) {
			result.add(ItemGroupTransformer.transform(rs));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}

		// B2 : SELECT --> executeQuery

		return result; 		
	}

	@Override
	public void update(List<ItemGroup> itemGroups) {
		// update
		
	}

	@Override
	public void save(List<ItemGroup> itemGroups) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO LoaiHang(MaLH,TenLH)\n"
				+ "VALUES(? ,?)";
      	int batchCount = 0;
      	try {
			pst = conn.prepareStatement(sql);
			for (ItemGroup itemGroup : itemGroups) {
				// update
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
				if (++batchCount > 100) {
					pst.executeBatch();
				}
			}
			int[] affectedRows = pst.executeBatch();
			System.out.println(">>> AffectedRows >>" + Arrays.toString(affectedRows));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
