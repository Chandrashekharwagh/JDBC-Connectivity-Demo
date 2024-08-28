package com.electra.service;

import com.electra.model.Employee;
import com.electra.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private static EmployeeRepository employeeRepository = new EmployeeRepository();

    public static List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
