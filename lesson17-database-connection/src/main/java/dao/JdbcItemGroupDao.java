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
import persistence.ItemGroupRawData;
import utils.SqlUtils;
public class JdbcItemGroupDao implements ItemGroupDao {

	private final Connection conn;
	private Statement st; // wrapper wrap sql --> run sql in dbms
	private PreparedStatement pst; // passing parameters into sql
	private ResultSet rs; // temporary table after excute query

	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	private static final String GET_ITEM_GROUPS = ""
			+ "WITH ThongTinMatHang as(\n"
			+ "	SELECT mh.MaMH, mh.TenMH, sum(ctmh.SoLuong) SoLuong, lh.*\n"
			+ "    FROM loaihang lh\n"
			+ "    JOIN mathang mh ON lh.MaLH = mh.MaLH\n"
			+ "    JOIN chitietmathang ctmh ON ctmh.MaMH = mh.MaMH\n"
			+ "    GROUP BY mh.MaMH\n"
			+ ")\n"
			+ "SELECT ttmh.MaLH, ttmh.TenLH, sum(ttmh.SoLuong) SoLuong, GROUP_CONCAT(concat(ttmh.TenMH,'-', ttmh.SoLuong)) DanhSachMatHang\n"
			+ "FROM ThongTinMatHang ttmh\n"
			+ "GROUP BY ttmh.MaLH;";

	@Override
	public List<ItemGroup> getAll() {
		// B1: Write down a native query --> db(true)
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		String sql = "SELECT * FROM LoaiHang";
		try {
			st = conn.createStatement();
			// B2: SELECT -> excuteQuery
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLh"), rs.getString("TenLH"));
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
	public ItemGroup get(int id) {
		// B1: Write down a native query --> db(true)
		ItemGroup result = null;
		String sql = "SELECT * FROM LoaiHang WHERE MaLH = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLh"), rs.getString("TenLH"));
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
		// String sql = "SELECT * FROM LoaiHang WHERE TenLH =  '" + name + "'";
		String sql = "SELECT * FROM LoaiHang WHERE TenLH = ?";
		try {
			// st = conn.createStatement();
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			// rs = st.executeQuery(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLh"), rs.getString("TenLH"));
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
	
	@Override
	public void update(ItemGroup itemGroup) {
		String sql = ""
				+ "UPDATE LoaiHang\n"
				+ "SET TenLH = ?\n"
				+ "WHERE MALH = ?";
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
	public List<ItemGroupRawData> getItemGroups() {
		List<ItemGroupRawData> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(GET_ITEM_GROUPS);
			while (rs.next()) {
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
			SqlUtils.close(rs, st);
		}

		return result;
	}
}
