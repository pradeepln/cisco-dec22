package com.cisco.training.functional;

import java.util.Optional;

public class DBUtil {
	
	public static Optional<Employee> getEmployeeFromDB(int empId) {
		// query db -----> select * from employee where id=empId
		boolean rowFound = false;
		
		if(rowFound) {
			return Optional.of(new Employee(empId, "nameAsFoundInDB"));
		}else {
			return Optional.empty();
		}
		
	}

}
