package service;

import persistence.Employee;

public interface EmployeeService {
	void save(Employee employee);
	Employee login(String email, String password);
}
