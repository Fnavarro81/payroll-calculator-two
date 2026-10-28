package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int emplyeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = emplyeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay(double hoursWorked, double payRate) {
        // regularGrossPay is the the gross pay of an assumed 40 hours times pay rate, to be used in case of overtime pay
        double regularGrossPay = 40 * payRate;
        double overTimeHours = hoursWorked - 40;
        double overTimePayRate = payRate * 1.5;
        double overTimeGrossPay = overTimePayRate * overTimeHours;
        if (hoursWorked > 40){
            return regularGrossPay + overTimeGrossPay;
        } else{
            return payRate * hoursWorked;
        }
    }
}