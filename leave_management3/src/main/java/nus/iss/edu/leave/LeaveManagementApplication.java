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
	
/*	@Autowired
	EmployeeRepository erepo;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	Date date;*/
	
	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementApplication.class, args);
	}
	
	/*
	 * @Bean public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	 * return args ->{
	 * 
	 * Employee e1 = new Employee(); e1.setAddress("aaaa");
	 * e1.setContact_no(95185999);
	 * 
	 * date = new Date ("01-02-1999"); e1.setDoh(date); e1.setName("sam");
	 * e1.setPassword("123"); e1.setEmail("acbc@gmail.com");
	 * 
	 * };
	 * 
	 * }
	 */
}