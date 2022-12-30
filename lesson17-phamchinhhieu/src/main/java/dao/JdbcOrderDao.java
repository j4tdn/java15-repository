package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import connection.DbConnection;

public class JdbcOrderDao implements OrderDao {
	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	private static final String UPDATE_DELIVERY_FEE = ""
			+ "UPDATE DonHang "
			+ "set PhiVanChuyen = ? "
			+ "where DATE(ThoiGianDatHang) = ?";
	//java.sql.Date,Time,TimesTamp
	//?2 --> DATE || TIME ""DATETIME(TIMESTAMP)
	//pstsetDate, detTime, setTimeStamp
	//--> tương thích, tự động convert vào các KDL trong CSDL
	public JdbcOrderDao() {
		connection = DbConnection.getConnection();
	}
	@Override
	///18.12.2020 
	public void update(LocalDate deliveryDate, double deliveryFee) {
		try {
			pst = connection.prepareStatement(UPDATE_DELIVERY_FEE);
			pst.setDouble(1, deliveryFee);
			pst.setDate(2, Date.valueOf(deliveryDate));
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
