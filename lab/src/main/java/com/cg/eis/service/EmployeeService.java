package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	

	public boolean addEmployee(Employee employee);
	
	public String findInsuranceScheme(double employeeSalary, String employeeDesignation);
	
	public Employee showEmployee(int employeeId);

}
