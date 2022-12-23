package dao;

import persistence.Employee;

public interface EmployeeDao {
	void save(Employee employee);
	Employee login(String email, String password);
}
