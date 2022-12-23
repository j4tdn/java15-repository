package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DbConnection;
import persistence.Employee;
import persistence.Title;
import utils.SqlUtils;

public class JdbcEmployeeDao implements EmployeeDao{
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcEmployeeDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public void save(Employee employee) {
		final String sql = ""
				+ "INSERT INTO NhanVien(MaNV, TenNV, Email, SDT, DiaChi, MatKhau, MaCV)\n"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, employee.getId());
			pst.setString(2, employee.getName());
			pst.setString(3, employee.getEmail());
			pst.setString(4, employee.getPhone());
			pst.setString(5, employee.getAddress());
			pst.setString(6, SqlUtils.md5(employee.getPassword()));
			pst.setInt(7, employee.getTitle().getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		System.out.println(">>> Account " + employee.getEmail() + " is created successful ...");
	}
	
	@Override
	public Employee login(String email, String password) {
		Employee employee = null;
		
		final String sql = ""
				+ "SELECT MaNV " + Employee.PROP_ID + ",\n"
				+ "		  TenNV " + Employee.PROP_NAME + ",\n"
				+ "		  Email " + Employee.PROP_EMAIL + ",\n"
				+ "		  SDT " + Employee.PROP_PHONE + ",\n"
				+ "		  DiaChi " + Employee.PROP_ADDRESS + ",\n"
				+ "		  MaCV " + Employee.PROP_TITLE_ID  + "\n"
				+ "  FROM NhanVien\n"
				+ " WHERE Email = ?\n"
				+ "   AND MatKhau = ?";
		
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, SqlUtils.md5(password));
			rs = pst.executeQuery();
			if (rs.next()) {
				employee = new Employee(
						rs.getInt(Employee.PROP_ID), 
						rs.getString(Employee.PROP_NAME), 
						rs.getString(Employee.PROP_EMAIL), 
						rs.getString(Employee.PROP_PHONE), 
						rs.getString(Employee.PROP_ADDRESS), 
						new Title(rs.getInt(Employee.PROP_TITLE_ID)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	
}
