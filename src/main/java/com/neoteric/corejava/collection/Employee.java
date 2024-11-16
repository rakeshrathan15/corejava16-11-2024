package com.neoteric.corejava.collection;

import java.util.Objects;

public class Employee {


    private String employeeName;

    private String employeeId;

    public Employee(String employeeName, String employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Employee employee)) return false;
        return Objects.equals(employeeName, employee.employeeName) && Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeeId);
    }



}
