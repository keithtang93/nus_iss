package nus.iss.edu.leave.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import nus.iss.edu.leave.model.Employee;
import nus.iss.edu.leave.model.LeaveApplication;
import nus.iss.edu.leave.repo.LeaveEntitlementRepo;
import nus.iss.edu.leave.service.EmployeeService;
import nus.iss.edu.leave.service.EmployeeServiceImpl;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	protected EmployeeService empservice;
	
	@Autowired
	protected LeaveEntitlementRepo levEntRepo;
	
	@Autowired
	public void setEmployeeService (EmployeeServiceImpl empserviceim)
	{
		this.empservice = empserviceim;
	}
	@GetMapping(value = "/login")
	public String loginPage(@ModelAttribute("employee") Employee emp) {
		emp = new Employee();
		return "employee-login";
	}

	@RequestMapping(value = "/submit")
	public String loginPage(@ModelAttribute ("employee") @Valid Employee emp, BindingResult result, Model model) {

		if (result.hasErrors())
			return "employee-login";
		
		Employee employee = empservice.findEmployeeByName(emp.getName());

		if(employee == null)
		{
			model.addAttribute("errMsg","Invalid username!");
			return "employee-login"; 
		}
		else if(emp.getPassword() != employee.getPassword())
		{
			model.addAttribute("errMsg","Incorrect password!");
			return "employee-login";
		}
		model.addAttribute("emp", employee);
		return "employee-leavelist";
	}

	@RequestMapping(value = "/applyLeave") 
	public String applyLeave (Model model) {
		model.addAttribute("leaveapplication", new LeaveApplication());
		return "leave-form"; 
	}
	
	@RequestMapping(value = "/submitLeave") 
	public String sumibtLeave () {

		return "employee-leavelist"; 
	}

}
