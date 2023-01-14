package com.CodewithAshu.RestfullCrudOperation1.Service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.CodewithAshu.RestfullCrudOperation1.model.Employee;


public interface EmployeeServiceI {
	
	public boolean saveEmployee(Employee emp);
	
	public boolean saveAllEmployee(List<Employee> emp);
	
	public List<Employee> getAllEmployees();
	
	public Employee getByEmployeeIdQueryParam(int empId);
	
    public Employee getByEmployeeIdPathParam(int empId);
     
     public Employee getByEmployeeByRequestBody(Employee emp);

    public boolean updateEmployee(Employee emp);
    
    public boolean updateAllEmployee(List<Employee> emp);

   public boolean deleteById(int empId);
   
   public boolean deleteAllEmployee();


}
