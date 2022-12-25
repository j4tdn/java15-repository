package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.Order;
import persistence.OrderDetail;
import utils.DateUtils;

public class JdbcItemDao implements ItemDao {
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	
	private static final String GET_TOP_3 = ""
			+ "WITH ThongTinDonHang AS \n"
			+ "(SELECT dh.MaDH, mh.MaMH, mh.TenMH, sum(ctdh.SoLuong) as SoLuongBan\n"
			+ "FROM mathang mh\n"
			+ "JOIN chitietdonhang ctdh ON ctdh.MaMH = mh.MaMH\n"
			+ "JOIN donhang dh ON dh.MaDH = ctdh.MaDH\n"
			+ "WHERE year(dh.ThoiGianDatHang) = ?\n"
			+ "GROUP BY mh.MaMH\n"
			+ "ORDER BY SoLuongBan DESC\n"
			+ "),\n"
			+ "TOP_3 AS\n"
			+ "	(SELECT * \n"
			+ "    FROM ThongTinDonHang\n"
			+ "    LIMIT 3)\n"
			+ "    SELECT *\n"
			+ "    FROM TOP_3\n"
			+ "    UNION\n"
			+ "    SELECT *\n"
			+ "    FROM ThongTinDonHang\n"
			+ "    WHERE SoLuongBan = (SELECT MIN(SoLuongBan) FROM TOP_3)";

			

	String sql = ""
			+ "SELECT * \n"
			+ "FROM donhang \n"
			+ "JOIN chitietdonhang ON donhang.MaDH = chitietdonhang.MaDH \n"
			+ "JOIN mathang ON chitietdonhang.MaMH = chitietdonhang.MaMH \n"
			+ "WHERE date(ThoiGianDatHang) =  ?";	
	

	@Override
	public List<Item> getItems(LocalDate orderDate) {
		List<Item> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(sql);
			pst.setDate(1, DateUtils.toSDate(orderDate));
			rs = pst.executeQuery();
			while(rs.next()) {
				Order order = new Order(rs.getInt("MaDH"), rs.getDate("ThoiGianDatHang"));
				Item item = new Item(
						rs.getInt("MaMH"),
						rs.getString("TenMH"),
						order);
				result.add(item);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return result;
	}
	
	@Override
	public List<Item> getTop3(int orderYear) {
		List<Item> result = new ArrayList<>();
			try {
				pst = connection.prepareStatement(GET_TOP_3);
				pst.setInt(1, orderYear);
				rs = pst.executeQuery();
				while(rs.next()) {
					OrderDetail orderDetail = new OrderDetail(rs.getInt("MaDH"), rs.getInt("SoLuongBan"));
					Item item = new Item(
							rs.getInt("MaMH"),
							rs.getString("TenMH"),
							orderDetail);
					result.add(item);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return result;
	}


}
