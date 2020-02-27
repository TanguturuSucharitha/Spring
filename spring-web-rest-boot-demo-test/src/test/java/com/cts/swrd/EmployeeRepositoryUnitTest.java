package com.cts.swrd;


import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.swrd.dao.EmployeeRepository;
import com.cts.swrd.model.Department;
import com.cts.swrd.model.Employee;

@RunWith(SpringRunner.class)// a bridge between spring boot test features and Junit
@DataJpaTest //configuring h2,an in-memory database,setting hibernate,spring data and
public class EmployeeRepositoryUnitTest {
	
	private Employee emps[];
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeRepositoryUnitTest() {
		emps=new Employee[] {
			 new Employee("Suchi","Tanguturu",40000,LocalDate.now(),Department.DEVELOPMENT,"9441027798","suchi12@gmail.com")
		};
	}
	
	@Before
	public void beforeEachTest() {
		for(Employee e:emps) {
			entityManager.persist(e);
		}
		entityManager.flush();	
	}
	
	@After
	public void afterEachTest() {
		for(Employee e:emps) {
			entityManager.remove(e);
		}
		entityManager.flush();
	}
	
	@Test
	public void whenFindByMobileNumber_thenReturnEmployee() {
		Employee e=employeeRepository.findByMobileNumber(emps[0].getMobileNumber());
		assertThat(e).isEqualTo(emps[0]);
	}
	
	@Test
	public void whenFindByMobileNumber_withNonExistingMobileNumber_thenReturnNull() {
		Employee e=employeeRepository.findByMobileNumber("9398680882");
		assertThat(e).isNull();
	}
	
	
}
