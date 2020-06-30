package nus.iss.edu.leave;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;

import nus.iss.edu.leave.model.Employee;
import nus.iss.edu.leave.repo.EmployeeRepository;




@SpringBootApplication
public class LeaveManagementApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementApplication.class, args);
	}
}