package com.cognizant.employeemanagementsystem.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Employee> employees = new ArrayList<>();
}