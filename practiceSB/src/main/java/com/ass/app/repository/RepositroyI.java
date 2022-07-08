package com.ass.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ass.app.model.Employee;
@Repository
public interface RepositroyI extends JpaRepository<Employee,Integer> {

}
