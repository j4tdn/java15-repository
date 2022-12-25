package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemDto;
import utils.DateUtils;

public class JdbcItemDao implements ItemDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
 
	
	private final String sql = "select mh.MaMH ,"
			+ " mh.TenMH , "
			+ " cast(dh.ThoiGianDatHang as time) ThoiGianDatHang"
			+ " from mathang mh "
			+ " join chitietdonhang ctdh "
			+ " on mh.MaMH = ctdh.MaMH "
			+ " join donhang dh "
			+ " on dh.MaDH = ctdh.MaDH "
			+ " where Date(dh.ThoiGianDatHang)"
			+ " = ? ;" ;
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<Item> getItems(LocalDate deliveryDate) {
		try {
			pst = connection.prepareStatement(sql);
			pst.setDate(1,DateUtils.toSDate(deliveryDate));
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemDto item = new ItemDto(rs.getInt("mh.MaLH")
						,rs.getString("mhTenMH")
						,rs.getTime("ThoiGianDatHang"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
