package com.example.department_employee_relation.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    private Integer empId;
    private String empName;
    @ManyToOne()
    @JoinColumn(name="department_id", referencedColumnName = "depId") // this is owing entity since it has the foreign key ie JoinColumn function
    @JsonBackReference // this is used in child to ignore serialization
    private Department department;

    public Employee(Integer empId, String empName, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }

    public Employee() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
