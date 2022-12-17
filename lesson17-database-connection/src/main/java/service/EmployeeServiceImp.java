package service;

import java.util.Objects;

import dao.EmployeeDao;
import dao.JdbcEmployeeDao;
import persistence.Employee;

public class EmployeeServiceImp implements EmployeeService {
	private EmployeeDao employeeDao;

	public EmployeeServiceImp() {
		employeeDao = new JdbcEmployeeDao();
	}

	@Override
	public void save(Employee employee) {
		Objects.requireNonNull(employee);
        employeeDao.save(employee);
	}

	@Override
	public Employee login(String email, String password) {
		Objects.requireNonNull(email);
		Objects.requireNonNull(password);
		return employeeDao.login(email, password);
	}
}