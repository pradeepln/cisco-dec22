package com.cisco.training.functional;

import java.util.Optional;

public class EmpApp {

	public static void main(String[] args) {
		
		//get the id from ui
		// style 1
		int id = 123;
		
		Optional<Employee> opt = DBUtil.getEmployeeFromDB(id);
				
		//fill the ui with employee data
		if(opt.isPresent()) {
			Employee e = opt.get();
			System.out.println(e.getName().toUpperCase());
		}
		
		//style 2
		Employee defEmp = new Employee(0, "no data");
		
		Employee e1 = DBUtil.getEmployeeFromDB(id).orElse(defEmp);
		System.out.println(e1.getName().toUpperCase());
	}

}
