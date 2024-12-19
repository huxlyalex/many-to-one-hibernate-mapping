package com.example.department_employee_relation.controller;


import com.example.department_employee_relation.entity.Department;
import com.example.department_employee_relation.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {


    @Autowired
    DepartmentService departmentService;


    @PostMapping("/save_department")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department dept)
    {
        return  new ResponseEntity<>(departmentService.saveDepartment(dept), HttpStatus.ACCEPTED);
    }

    @PostMapping("/getData/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Integer id)
    {
        return  new ResponseEntity<>(departmentService.getDepartment(id), HttpStatus.ACCEPTED);

    }





}
