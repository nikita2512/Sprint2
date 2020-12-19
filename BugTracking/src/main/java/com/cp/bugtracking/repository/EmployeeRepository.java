package com.cp.bugtracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cp.bugtracking.entities.Employee;



public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
