package com.electra;

import com.electra.model.Employee;
import com.electra.service.EmployeeService;
import java.util.List;


public class App {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeService.getAllEmployees();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
