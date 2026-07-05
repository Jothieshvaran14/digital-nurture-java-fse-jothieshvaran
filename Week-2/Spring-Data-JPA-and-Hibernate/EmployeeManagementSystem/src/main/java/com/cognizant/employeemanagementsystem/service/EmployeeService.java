package com.cognizant.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployee(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    public List<Employee> searchByName(String name) {
        return repository.findByNameContaining(name);
    }

    public List<Employee> searchByDepartment(String department) {
        return repository.getEmployeesByDepartment(department);
    }

    public Page<Employee> getEmployees(Pageable pageable) {
        return repository.findAll(pageable);
    }
}