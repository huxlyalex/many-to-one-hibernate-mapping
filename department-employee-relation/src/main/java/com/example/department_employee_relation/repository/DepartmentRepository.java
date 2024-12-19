package com.example.department_employee_relation.repository;


import com.example.department_employee_relation.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>
{

}
