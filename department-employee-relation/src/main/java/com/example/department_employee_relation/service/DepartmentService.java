package com.example.department_employee_relation.service;


import com.example.department_employee_relation.entity.Department;

public interface DepartmentService {
    public Department saveDepartment(Department dept);

    public Department getDepartment(Integer id);
}
