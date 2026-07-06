package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.model.Employee;

@Repository
public class DepartmentDao {

    private static List<Department> DEPARTMENT_LIST;

    @SuppressWarnings("unchecked")
    public DepartmentDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        ArrayList<Employee> employees =
                context.getBean("employeeList", ArrayList.class);

        DEPARTMENT_LIST = new ArrayList<>();

        for (Employee employee : employees) {
            Department department = employee.getDepartment();

            if (DEPARTMENT_LIST.stream().noneMatch(d -> d.getId() == department.getId())) {
                DEPARTMENT_LIST.add(department);
            }
        }
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}