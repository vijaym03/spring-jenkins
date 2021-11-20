package com.springsetup.springboot.service;

import com.springsetup.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    List<Department> getDepartments();
}
