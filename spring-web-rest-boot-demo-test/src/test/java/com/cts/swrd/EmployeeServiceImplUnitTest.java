package com.cts.swrd;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;


import com.cts.swrd.dao.EmployeeRepository;
import com.cts.swrd.model.Department;
import com.cts.swrd.model.Employee;
import com.cts.swrd.service.EmployeeService;
import com.cts.swrd.service.EmployeeServiceImpl;


	@RunWith(SpringRunner.class)
	public class EmployeeServiceImplUnitTest {

	@TestConfiguration
	static class EmployeeServiceImplTextContextConfiguration {

	@Bean
	public EmployeeService employeeservice() {
    return new EmployeeServiceImpl();
	
	}
	}
	@Autowired
	private EmployeeService employeeservice;

	@MockBean
	private EmployeeRepository employeerepository;
	
	@Before
	public void setUp() {
		Employee emp=new Employee("su","Tangut",30000,LocalDate.now(),Department.DEVELOPMENT,"9441027798","suchi12@gmail.com");
		
		Mockito.when(employeerepository.findByMobileNumber(emp.getMobileNumber())).thenReturn(emp);
	}
	
	@Test
	public void whenValidMobileNumber_thenEmployeeShouldBeFound() {
		String mno="9441027798";
		Employee found=employeeservice.findByMobileNumber(mno);
		assertThat(found.getMobileNumber()).isEqualTo(mno);
	}
	@Test
	public void whenValidMobileNumber_thenEmployeeShouldNotBeFound() {
		String mno="9441027798";
		Employee found=employeeservice.findByMobileNumber(mno);
		assertThat(found).isNull();
	}
	

}

