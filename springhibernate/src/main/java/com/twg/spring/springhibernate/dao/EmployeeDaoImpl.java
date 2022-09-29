package com.twg.spring.springhibernate.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.twg.spring.springhibernate.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private HibernateTemplate hibernatetemplate;
	

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	@Transactional(readOnly = false)
	public void save(Employee employee) {
		hibernatetemplate.save(employee);
	}

	public void update(Employee employee) {
		hibernatetemplate.update(employee);
	}

	public void delete(Employee employee) {
		hibernatetemplate.delete(employee);
	}

	public Employee findById(int id) {
		Employee emp=hibernatetemplate.get(Employee.class, id);
		return emp;
	}

	public List<Employee> findAll() {
		return  hibernatetemplate.loadAll(Employee.class);
		
		}
		
	}


