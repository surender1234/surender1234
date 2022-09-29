package com.twg.spring.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.twg.spring.springhibernate.business.EmployeeBusiness;
import com.twg.spring.springhibernate.business.EmployeeBusinessImpl;
import com.twg.spring.springhibernate.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	EmployeeBusiness employeeBusiness = (EmployeeBusinessImpl) context.getBean("employeeBusinessImpl");
    	
    	Employee employee= new Employee();
    	
    	employee.setId(2);
    	employee.setEname("Ramesh");
    	employee.setAddress("Hyd");
    	employee.setContact("99999");
    	employee.setExp(11);
    	
    	employeeBusiness.save(employee);
    	
    }
}
