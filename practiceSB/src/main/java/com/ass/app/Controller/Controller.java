package com.ass.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ass.app.model.Employee;
import com.ass.app.service.ServiceI;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	ServiceI si;
	
	@PostMapping("/emp")
	public ResponseEntity<Employee> postData(@RequestBody Employee e){
		
		Employee employee = si.postData(e);
		return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
	}
	@GetMapping("/emp")
	public ResponseEntity<Iterable<Employee>> geteData(){
		Iterable<Employee> data = si.getAllData();
		return new ResponseEntity<Iterable<Employee>>(data,HttpStatus.OK);
	}
	@PutMapping("/emp/{eid}")
	public ResponseEntity<String>updateData(@RequestBody Employee e,@PathVariable Integer eid){
		
		return new ResponseEntity<String>(si.updatedata(e,eid),HttpStatus.OK);
		
	}
	@DeleteMapping("/emp/{eid}")
	public ResponseEntity<String> deleteData(@PathVariable Integer eid){
		
		return new ResponseEntity(si.deleteData(eid),HttpStatus.NO_CONTENT);
	}
}
