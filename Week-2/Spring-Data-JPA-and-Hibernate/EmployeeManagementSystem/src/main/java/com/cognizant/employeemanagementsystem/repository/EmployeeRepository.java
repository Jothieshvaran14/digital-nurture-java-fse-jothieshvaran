package com.cognizant.employeemanagementsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.projection.EmployeeProjection;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByNameContaining(String name);

    List<Employee> findByNameStartingWith(String prefix);

    Optional<Employee> findByEmail(String email);

    @Query("select e from Employee e where e.department.name=?1")
    List<Employee> getEmployeesByDepartment(String department);

    Page<Employee> findAll(Pageable pageable);

    List<EmployeeProjection> findBy();
}