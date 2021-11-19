package com.ss.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.employeemanager.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	void deleteEmployeeById(Long id); //query method because of naming convention

	Optional<Employee> findEmployeeById(Long id);

}
