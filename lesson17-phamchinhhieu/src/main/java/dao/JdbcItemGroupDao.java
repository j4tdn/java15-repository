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

	private static final String GET_ITEM_GROUPS = ""
			+ "select lh.*, group_concat(concat(mh.TenMH, '-', ctmh.MaKC, '-', ctmh.SoLuong))DanhSachMatHang, sum(ctmh.SoLuong) SoLuong from loaihang lh\r\n"
			+ "join mathang mh \r\n"
			+ "on lh.MaLH = mh.MaLH\r\n"
			+ "join chitietmathang ctmh \r\n"
			+ "on ctmh.MaMH = mh.MaMH\r\n"
			+ "group by TenLH\r\n"
			+ "order by MaLH;";

	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
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

	

	

}
