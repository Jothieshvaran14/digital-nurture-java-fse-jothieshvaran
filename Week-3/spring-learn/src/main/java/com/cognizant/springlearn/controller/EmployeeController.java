package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import com.cognizant.springlearn.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.service.EmployeeService;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PutMapping("/employees")
    public void updateEmployee(@RequestBody @Valid Employee employee)
            throws EmployeeNotFoundException {

        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id)
            throws EmployeeNotFoundException {

        employeeService.deleteEmployee(id);
    }

}