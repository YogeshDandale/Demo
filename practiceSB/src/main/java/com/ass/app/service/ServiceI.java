package com.ass.app.service;

import org.springframework.util.MultiValueMap;

import com.ass.app.model.Employee;

public interface ServiceI {

	public Employee postData(Employee s );
	
	public Iterable<Employee> getAllData();

	public String updatedata(Employee e,Integer id);
	
	public String deleteData(Integer id);
}
