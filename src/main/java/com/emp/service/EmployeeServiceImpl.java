package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	
	List<Employee> list = List.of(
			new Employee(1311L,"Peter Parker","231312"),
			new Employee(1312L,"Tonny Robbins","332223"),
			new Employee(1313L,"Robert","433443"),
			new Employee(1314L,"Chris","43344"),
			new Employee(1315L,"Sam","342243"),
			new Employee(1316L,"William","434443"),
			new Employee(1317L,"Max","6788"),
			new Employee(1318L,"Lucy","68756"),
			new Employee(1319L,"Sofia","778855")
			
			);

	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(employee-> employee.geteId().equals(id)).findAny().orElse(null);
	}

	
}
