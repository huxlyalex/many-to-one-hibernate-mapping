package com.example.department_employee_relation.service;


import com.example.department_employee_relation.entity.Department;
import com.example.department_employee_relation.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements DepartmentService
{
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department dept) {

        return departmentRepository.save(dept);
    }

    @Override
    public Department getDepartment(Integer id) {
       return  departmentRepository.findById(id).get();
    }
}
