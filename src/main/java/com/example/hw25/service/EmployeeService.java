package com.example.hw25.service;

import com.example.hw25.exeption.EmployeeAlreadyAddedException;
import com.example.hw25.exeption.EmployeeNotFoundException;
import com.example.hw25.exeption.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;
import com.example.hw25.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class EmployeeService {

        private static final int LIMIT = 10;
        private final List<Employee> employees;
        public EmployeeService() {


            this.employees = new ArrayList<>();
        }
        public Employee addEmployee (String name, String surname){
            Employee employee = new Employee(name, surname);
            if (employees.contains(employee)) {
                throw new EmployeeAlreadyAddedException();
            }

            if (employees.size() < LIMIT) {
                employees.add(employee);
                return employee;
            }
            throw new EmployeeStorageIsFullException();
        }
        public Employee findEmployee (String name, String surname){
            Employee employee = new Employee(name, surname);
            if (!employees.contains(employee)) {
                throw new EmployeeNotFoundException();
            }
            return employee;
        }

        public Employee removeEmployee (String name, String surname){
            Employee employee = new Employee(name, surname);
            if (!employees.contains(employee)) {
                throw new EmployeeNotFoundException();
            }
            employees.remove(employee);
            return employee;
        }
        public List<Employee> getAll(){
            return new ArrayList<>(employees);
        }

}



