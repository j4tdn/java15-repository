package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import connection.DbConnection;
import utils.DateUtils;

public class JdbcOrderDao implements OrderDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;

	public static final String UPDATE_DELIVERY_FEE = "" + "UPDATE DonHang \n" + "SET PhiVanChuyen = ? \n"
			+ "WHERE DATE(ThoiGianDatHang) =?";

	public JdbcOrderDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public void update(LocalDate deliveryDate, double deliveryFee) {
		try {
			pst = connection.prepareStatement(UPDATE_DELIVERY_FEE);
			pst.setDouble(1, deliveryFee);
			pst.setDate(2, DateUtils.toSDate(deliveryDate));
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
