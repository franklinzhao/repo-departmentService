package com.zhao.microservice.department.service.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhao.microservice.department.service.entity.Department;
import com.zhao.microservice.department.service.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		log.info("indside saveDepartment of DeparetmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		log.info("indside findDepartmentById of DeparetmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
