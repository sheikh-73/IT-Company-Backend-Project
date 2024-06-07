package com.example.dto;

import com.example.entities.Address;
import com.example.repository.EmployeeDataRepository;

public class EmployeeDataDto
{
    private int id;
    private String name;
    private String joiningDate;
    private double salary;
    private String email;
    private String password;
    private String address;
    public EmployeeDataDto(int id, String name, String joiningDate, double salary, String email, String password, String address)
    {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
        this.salary = salary;
        this.email = email;
        this.password = password;
        this.address = address;
    }
    public EmployeeDataDto() {}

    //Getter Method:
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getJoiningDate()
    {
        return this.joiningDate;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getAddress()
    {
        return this.address;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
