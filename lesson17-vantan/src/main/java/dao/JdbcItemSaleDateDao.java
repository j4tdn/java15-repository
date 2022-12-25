package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemSaleDate;
import utils.SqlUtils;

public class JdbcItemSaleDateDao implements ItemSaleDateDao{
	private Connection connection;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;
	
	public JdbcItemSaleDateDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<ItemSaleDate> get(LocalDate date) {
		
	List<ItemSaleDate> result = new ArrayList<>();
	final String sql = ""
			+ "SELECT mh.MaMH,\n"
			+ "	 mh.TenMH,\n"
			+ "   time(dh.ThoiGianDatHang) ThoiGianDatHang\n"
			+ " FROM MatHang mh\n"
			+ "JOIN ChiTietDonHang ctdh\n"
			+ "ON mh.MaMH = ctdh.MaMH\n"
			+ "JOIN DonHang dh\n"
			+ "ON ctdh.MaDH = dh.MaDH\n"
			+ "WHERE date(ThoiGianDatHang) = ?";
	
	try {
		pst = connection.prepareStatement(sql);
		pst.setDate(1, SqlUtils.sqlDate(date));
		rs = pst.executeQuery();
		while(rs.next()) {
			ItemSaleDate itemSaleDate = new ItemSaleDate(
					rs.getInt("MaMH"), 
					rs.getString("TenMH"), 
					SqlUtils.sqlDate(rs.getTime("ThoiGianDatHang")));
			result.add(itemSaleDate);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
		return result;
	}
}
