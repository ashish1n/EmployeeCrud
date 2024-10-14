package com.example.EmployeeCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.EmployeeCrud.entity.Employee;
import com.example.EmployeeCrud.repository.EmployeeRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@SpringBootApplication
public class EmployeeCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		 /*Employee employee1 = new Employee("Ramesh", employeeDobFromString("10-11-1984"), "ramesh@gmail.com", "2000", "24", "Active");
		 employeeRepository.save(employee1);
		 
		 Employee employee2 = new Employee("Sanjay", employeeDobFromString("05-04-1956"), "sanjay@gmail.com", "50000", "43", "Active");
		 employeeRepository.save(employee2);
		 
		 Employee employee3 = new Employee("tony", employeeDobFromString("18-10-1939"), "tony@gmail.com", "12000", "33", "Inactive");
		 employeeRepository.save(employee3);*/
		 
	}

	/*private Date employeeDobFromString(String dateString) {
		DateFormat format = new SimpleDateFormat("DD-MM-yyyy", Locale.ENGLISH);
		Date date = new Date();
		try {
			date = format.parse(dateString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}*/

}
