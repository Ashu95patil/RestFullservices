package com.CodewithAshu.RestfullCrudOperation1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodewithAshu.RestfullCrudOperation1.Repository.EmployeeRepository;
import com.CodewithAshu.RestfullCrudOperation1.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public boolean saveEmployee(Employee emp) {
		Employee save = employeeRepository.save(emp);
		
		if (save != null) {
			
			return true;
		}else {
		return false;
	}
	}

	@Override
	public boolean saveAllEmployee(List<Employee> emp) {
		List<Employee> saveAll = employeeRepository.saveAll(emp);
		
		if(saveAll != null) {
			return true;
		}else {
		return false;
	}
}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}

	@Override
	public Employee getByEmployeeIdQueryParam(int empId) {
		Employee findById = employeeRepository.findById(empId).get();
		return findById;
		
	}

	@Override
	public Employee getByEmployeeIdPathParam(int empId) {
		Employee pathparam = employeeRepository.findById(empId).get();
		return pathparam;
	}

	@Override
	public Employee getByEmployeeByRequestBody(Employee emp) {
		
		int Id = emp.getId();
		
		Employee findById = employeeRepository.findById(Id).get();
		return findById;
		 
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		Employee save = employeeRepository.save(emp);
		
		if(save != null) {
		return true;
	}else {
		return false;
	}
	}
	
	
	@Override
	public boolean updateAllEmployee(List<Employee> emp) {
		List<Employee> saveAll = employeeRepository.saveAll(emp);
		
		if(saveAll != null) {
		return true;
	}else {
		return false;
	}
	}

	@Override
	public boolean deleteById(int empId) {
		boolean existsById = employeeRepository.existsById(empId);
		if(existsById) {
			employeeRepository.deleteById(empId);
		return true;
	}else {
		return false;
}
	}

	@Override
	public boolean deleteAllEmployee() {
		List<Employee> employee = employeeRepository.findAll();
		
		if(employee != null) {
			employeeRepository.deleteAll();
			return true;
		}else {
		return false;
		
		
	}
	}
	}
	
