package com.ass.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ass.app.model.Employee;
import com.ass.app.repository.RepositroyI;
import com.ass.app.service.ServiceI;
@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	RepositroyI r;
	
	public Employee postData(Employee s ) {
		
		Employee save = r.save(s);
		return save;
	}
	public Iterable<Employee> getAllData(){
		List<Employee> list = r.findAll();
		return list;
	}
	public String updatedata(Employee e,Integer id)
	{
		e.setEid(id);
		r.save(e);
		return "update Successfully";
	}
	public String deleteData(Integer id) {

		r.deleteById(id);
		
		return "update Successfully";
	}
}
