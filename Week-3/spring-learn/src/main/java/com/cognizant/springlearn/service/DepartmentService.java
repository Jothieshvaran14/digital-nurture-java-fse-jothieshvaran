package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.springlearn.dao.DepartmentDao;
import com.cognizant.springlearn.model.Department;

@Service
public class DepartmentService {

    private final DepartmentDao departmentDao;

    public DepartmentService(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}