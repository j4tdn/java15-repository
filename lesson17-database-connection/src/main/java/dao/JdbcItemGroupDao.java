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

public class JdbcItemGroupDao implements ItemGroupDao {
	private final Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	private static final String GET_ITEM_GROUPS = "" + "with ThongTinMatHang as (\n" + "select mh.MaMH,\n"
			+ "	mh.TenMH,\n" + "    SUM(ctmh.SoLuong) SoLuong,\n" + "    lh.*\n" + "    from LoaiHang lh\n"
			+ "    join MatHang mh\n" + "    on lh.MaLH = mh.MaLH\n" + "    join ChiTietMatHang ctmh\n"
			+ "    on mh.MaMH = ctmh.MaMH \n" + "    group by mh.MaMH\n" + ")\n" + "SELECT ttmh.MaLH,\n"
			+ "ttmh.TenLH, SUM(ttmh.SoLuong) SoLuong,\n"
			+ "group_concat(concat(ttmh.MaMH, '-', ttmh.TenMH, '-', ttmh.SoLuong)) DanhSachMatHang\n"
			+ "from ThongTinMatHang ttmh\n" + "group by ttmh.MaLH;";

	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}

	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		String sql = "select * from loaihang";
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
	public List<ItemGroupDto> getItemsGroups() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(GET_ITEM_GROUPS);
			while (rs.next()) {
				ItemGroupDto igDto = ItemGroupTransformer.transform(rs);
				result.add(igDto);

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
	public ItemGroup get(int id) {

		ItemGroup result = null;
		String sql = "select * from loaihang where MaLH = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
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
	public List<ItemGroup> search(String name) {
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		// String sql = "select * from loaihang where TenLH ='" + name+ "'";
		String sql = "select * from loaihang where TenLH = ?";

		try {
			// st = conn.createStatement();
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
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
	public void save(ItemGroup itemGroup) {
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)\n" + "values(?, ?)";
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
	public void save(List<ItemGroup> itemGroups) {
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)\n" + "values(?, ?)";
		int batchCount = 0;
		try {
			pst = conn.prepareStatement(sql);
			for (ItemGroup itemGroup : itemGroups) {
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
				if(++batchCount % 100 == 0) { //100 lần thực hiện 1 lần
					pst.executeBatch();
				}
			}
			int[] affectedRows = pst.executeBatch();
			System.out.println(">>> affectedRows >>>" + Arrays.toString(affectedRows));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}

	@Override
	public void update(ItemGroup itemGroup) {
		// TODO Auto-generated method stub
		String sql = "UPDATE LOAIHANG\n" + "SET TenLH = ?\n" + "WHERE MaLH = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, itemGroup.getName());
			pst.setInt(2, itemGroup.getId());
			pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}

}
