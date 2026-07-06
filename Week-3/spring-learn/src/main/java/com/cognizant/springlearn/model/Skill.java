package com.cognizant.springlearn.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Skill {

    @NotNull(message = "Skill id is required")
    @Min(value = 1, message = "Skill id must be greater than 0")
    private Integer id;

    @NotBlank(message = "Skill name is required")
    @Size(min = 1, max = 30, message = "Skill name must be between 1 and 30 characters")
    private String name;

    public Skill() {
    }

    public Skill(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill{id=" + id + ", name='" + name + "'}";
    }
}