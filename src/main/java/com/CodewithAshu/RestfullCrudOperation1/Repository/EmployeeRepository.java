package com.CodewithAshu.RestfullCrudOperation1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CodewithAshu.RestfullCrudOperation1.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

}
