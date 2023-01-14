package com.CodewithAshu.RestfullCrudOperation1.Controller;

//done by ashu
import java.util.List;


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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CodewithAshu.RestfullCrudOperation1.Service.EmployeeServiceI;
import com.CodewithAshu.RestfullCrudOperation1.model.Employee;

@RestController
@RequestMapping("/Employeedetails")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceI employeeServiceI;
	
	@PostMapping()
	public ResponseEntity<String> Saveemployeedata(@RequestBody Employee emp){
		
		 boolean saveEmployee = employeeServiceI.saveEmployee(emp);
		 if(saveEmployee) {
			 String msg ="!!....Welcome Employee Details  save Successfully....!! ";
		 
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		 }else {
			 String msg=" !!.... Sorry Employee Details Save Unsuccessfully.....!! ";
				return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);

		 }
	}
	
	@PostMapping("/saveall")
	public ResponseEntity <String> SaveAlldata(@RequestBody List<Employee> emp){
		
		boolean saveAllEmployee = employeeServiceI.saveAllEmployee(emp);
		if(saveAllEmployee) {
			String s="!!.... Save All Employee Details Successfully .....!!";
		
		return new ResponseEntity <String>(s,HttpStatus.CREATED);
		
		}else {
			
			String s="!!.... Unsuccessfully Save All Employee Details .....!!";
			
			return new ResponseEntity <String>(s,HttpStatus.BAD_REQUEST);
		}
			
		}
		
	@GetMapping("getAll")
	public ResponseEntity<List<Employee>> getAllEmployeeDetails(){
		List<Employee> allEmployees = employeeServiceI.getAllEmployees();
		return new ResponseEntity<List<Employee>>(allEmployees,HttpStatus.OK);
	
	}
	
	@GetMapping("/id")
	public ResponseEntity<Employee> getByIdQueryparam(@RequestParam int empId){
		
		Employee employee = employeeServiceI.getByEmployeeIdQueryParam(empId);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}
	
	@GetMapping("{empId}")
	public ResponseEntity<Employee> getByIdPathparam(@PathVariable int empId){
		
		Employee employee = employeeServiceI.getByEmployeeIdPathParam(empId);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}
	
	@PostMapping("/ByRequestBody")
	public ResponseEntity<Employee> getEmployeeDataByRequestBody(@RequestBody Employee emp){
		
		Employee requestBody = employeeServiceI.getByEmployeeByRequestBody(emp);
		return new ResponseEntity<Employee>(requestBody,HttpStatus.OK);
		
	}

	

	@PutMapping()
	public ResponseEntity<String> updateemployeedata(@RequestBody Employee emp){
		
		 boolean saveEmployee = employeeServiceI.updateEmployee(emp);
		 if(saveEmployee) {
			 String msg ="!!....Welcome Employee Details Update Successfully....!! ";
		 
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		 }else {
			 String msg=" !!.... Sorry Employee Details Update Unsuccessfully.....!! ";
				return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);

		 }
}
	
	
	@PutMapping("/updateall")
	public ResponseEntity <String> UpdateAlldata(@RequestBody List<Employee> emp){
		
		boolean saveAllEmployee = employeeServiceI.updateAllEmployee(emp);
		if(saveAllEmployee) {
			String s="!!.... update All Employee Details Successfully .....!!";
		
		return new ResponseEntity <String>(s,HttpStatus.CREATED);
		
		}else {
			
			String s="!!.... Unsuccessfully update All Employee Details .....!!";
			
			return new ResponseEntity <String>(s,HttpStatus.BAD_REQUEST);
		}
		
			
		}
	

	@DeleteMapping("{empId}")
	public ResponseEntity<String> DeleteByIdPathparam(@PathVariable int empId){
		
		 boolean deleteById = employeeServiceI.deleteById(empId);
		 if(deleteById) {
		return new ResponseEntity<String>("Id deleted successfully...!!!!",HttpStatus.OK);
		 }else {
				return new ResponseEntity<String>("Id deleted Unsuccessfully...!!!!",HttpStatus.OK);
		 }
	}
	
	@DeleteMapping("/deleteall")
	public ResponseEntity <String> DeleteAlldata(){
		
		boolean saveAllEmployee = employeeServiceI.deleteAllEmployee();
		if(saveAllEmployee) {
			String s="!!.... Delete All Employee Details Successfully .....!!";
		
		return new ResponseEntity <String>(s,HttpStatus.OK);
		
		}else {
			
			String s="!!.... Unsuccessfully Delete All Employee Details .....!!";
			
			return new ResponseEntity <String>(s,HttpStatus.OK);
		}
	}
	
}
