package ru.skypro.lessons.springboot.springboothm2.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.springboothm2.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> employeeList = List.of(
            new Employee(1, "Joe", 23_000),
            new Employee(2, "Rose", 54_000),
            new Employee(3, "Semen", 134_000),
            new Employee(4, "Richard", 180_000));

    @Override
    public List<Employee> getListEmployees() {
        return employeeList;
    }

    @Override
    public void addEmployee(List<Employee> employees) {
        List<Employee> savedEmployees = new ArrayList<>(employeeList);
        savedEmployees.addAll(employees);
    }

    @Override
    public void editEmployee(Employee foundEmployee, Employee newEmployee) {
        foundEmployee.setName(newEmployee.getName());
        foundEmployee.setSalary(newEmployee.getSalary());
    }

    @Override
    public List<Employee> getListEmployeesForDeleting() {
        return new ArrayList<>(employeeList);
    }
}
