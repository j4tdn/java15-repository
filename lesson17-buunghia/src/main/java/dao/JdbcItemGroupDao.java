package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import dto.ItemGroupDto;
import persistence.ItemGroup;
import transformer.ItemGroupTransformer;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs ;
	
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<ItemGroupDto> getAmount() {
		List<ItemGroupDto> result = new ArrayList<>();
		String sql =
				"WITH ThongTinLoaiHang AS(\n"
				+ "	SELECT mh.MaMH,mh.TenMH,SUM(ctmh.SoLuong) SoLuong, ctmh.MaKC\n"
				+ "	FROM MatHang mh\n"
				+ "	JOIN ChiTietMatHang ctmh\n"
				+ "	ON mh.MaMH = ctmh.MaMH\n"
				+ "	JOIN LoaiHang lh\n"
				+ "	ON lh.MaLH = mh.MaLH\n"
				+ "	GROUP BY mh.MaMH\n"
				+ ")\n"
				+ "SELECT lh.MaLH, lh.TenLH, GROUP_CONCAT(CONCAT(mh.TenMH, '-', ttlh.MaKC, '-', ttlh.SoLuong)) DanhSachMatHang, SUM(ttlh.SoLuong) SoLuong\n"
				+ "FROM ThongTinLoaiHang ttlh\n"
				+ "JOIN MatHang mh\n"
				+ "ON ttlh.MaMH = mh.MaMH\n"
				+ "JOIN LoaiHang lh\n"
				+ "ON lh.MaLH = mh.MaLH\n"
				+ "GROUP BY lh.MaLH";
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(ItemGroupTransformer.transform(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
}
