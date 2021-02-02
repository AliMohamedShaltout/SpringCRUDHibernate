package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;
    private String empname;
    private String pos;

    public Employee() {

    }

    public Employee(Long empID, String empName, String position) {
        this.empid = empID;
        this.empname = empName;
        this.pos = position;
    }

    public Long getEmpNo() {
        return empid;
    }

    public void setEmpNo(Long empID) {
        this.empid = empID;
    }

    public String getEmpName() {
        return empname;
    }

    public void setEmpName(String empName) {
        this.empname = empName;
    }

    public String getPosition() {
        return pos;
    }

    public void setPosition(String position) {
        this.pos = position;
    }

}