package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import connection.DbConnection;
import utils.DateUtils;

public class JdbcOrderDao implements OrderDao {
	
	private final Connection conn;
	private PreparedStatement pst; // passing parameters into sql
	
	public JdbcOrderDao() {
		conn = DbConnection.getConnection();
	}
	
	private static final String UPDATE_DELIVERY_FEE = ""
			+ "UPDATE DonHang \n"
			+ "SET PhiVanChuyen = ?"
			+ "Where DATE(ThoiGianDatHang) = ?";

	@Override
	public void update(LocalDate deliveryDate, double deliveryFee) {
		try {
			pst = conn.prepareStatement(UPDATE_DELIVERY_FEE);
			pst.setDouble(1, deliveryFee);
			pst.setDate(2, DateUtils.toSDate(deliveryDate));
			pst.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
