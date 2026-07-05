package com.cognizant.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.entity.Department;
import com.cognizant.employeemanagementsystem.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    public Department getDepartment(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    public void deleteDepartment(Long id) {
        repository.deleteById(id);
    }
}