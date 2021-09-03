package com.example.springdatajpa;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
    List<Employee> findEmployeeByLastNameContaining(String lastName);
}
