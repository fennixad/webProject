package com.federico.interfacesDao;

import org.springframework.data.repository.CrudRepository;

import com.federico.entities.Employee;

public interface EmployeesCrudRepository extends CrudRepository<Employee, Integer> {
	
	
}