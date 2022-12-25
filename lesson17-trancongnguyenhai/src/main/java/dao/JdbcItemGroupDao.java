package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {

	private Connection conn;
	private Statement st;

	private ResultSet rs;
	
	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	@Override
	public List<ItemGroupDto> getAmountItemEachItemGroup() {
		String sql = ""
				+ "SELECT lh.MaLH, \n"
				+ "	   lh.TenLH,\n"
				+ "       GROUP_CONCAT(mh.TenMH, '-', ctmh.MaKC, '-', mh.MauSac) DanhSachMatHang,\n"
				+ "       SUM(ctmh.SoLuong) SoLuong\n"
				+ "  FROM loaihang lh\n"
				+ "  JOIN mathang mh\n"
				+ "    ON lh.MaLH = mh.MaLH\n"
				+ "  JOIN chitietmathang ctmh\n"
				+ "    ON mh.MaMH = ctmh.MaMH\n"
				+ " GROUP BY lh.MaLH;";
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroupDto igDto = new ItemGroupDto(
							rs.getInt("MaLH"),
							rs.getString("TenLH"),
							rs.getString("DanhSachMatHang"),
							rs.getInt("SoLuong")
						);
				result.add(igDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
