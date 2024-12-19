package com.example.department_employee_relation.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    private  Integer depId;
    private  String depName;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL) // cascade = CascadeType.ALL ,should use in parent entity
    @JsonManagedReference // this is used in parent to serialize normally
    List<Employee> employees;

    public Department(Integer depId, String depName, List<Employee> employees) {
        this.depId = depId;
        this.depName = depName;
        this.employees = employees;
    }

    public Department() {
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
