package com.ramesh.springdata.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;

import com.ramesh.springdata.idgenerators.entities.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
