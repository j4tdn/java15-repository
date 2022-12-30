package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import connection.DbConnection;
import utils.DateUtils;

public class JdbcOrderDao implements OrderDao{
	
	private final Connection conn;
	private PreparedStatement pst;
	
	private static final String UPDATE_DELIVERY_FEE = ""
			+ "UPDATE DonHang \n"
			+ "   SET PhiVanChuyen = ? \n"
			+ " WHERE DATE(ThoiGianDatHang) = ?";
	
	// java.sql.Date,Time,TimeStamp
	// ?2 --> DATE || TIME || DATETIME(TIMESTAMP)
	// pst.setDate, setTime, setTimeStamp
	// --> tương thích, tự động convert vào các KDL trong CSDL
	
	public JdbcOrderDao() {
		conn = DbConnection.getConnection();
	}
	
	@Override
	// 18.12.2020, 99
	// java.util.Date, Calendar, LocalDate
	public void update(LocalDate deliveryDate, double deliveryFee) {
		try {
			pst = conn.prepareStatement(UPDATE_DELIVERY_FEE);
			pst.setDouble(1, deliveryFee);
			pst.setDate(2, DateUtils.toSDate(deliveryDate));
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
