package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemDto;
import persistence.ItemGroupDto;
import persistence.ItemGroupTransformer;

public class JdbcItemGroupDao implements ItemGroupDao {
    
	private Connection connection;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	
	private static String sql = "select lh.MaLH , lh.TenLH , group_concat(concat(mh.TenMH,'-',ctmh.MaKC,'-',ctmh.Soluong,'-')) DanhSachMatHang,sum(ctmh.SoLuong) SoLuong from mathang mh join loaihang lh on mh.MaLH = lh.MaLH\r\n"
			+ "                         join chitietmathang ctmh on mh.MaMH = ctmh.MaMH\r\n"
			+ "                         group by lh.MaLH;" ;
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}
	@Override
	public List<ItemGroupDto> getAll() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				result.add(ItemGroupTransformer.transform(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
	
}
