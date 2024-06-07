package com.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;

@Entity
@Table(name = "Employee_Data")
public class EmployeeData
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", length = 45)
    private int id;

    @Column(name = "Name", length = 255)
    private String name;
    @Column(name = "Joining_Date", length = 255)
    private String joiningDate;
    @Column(name = "Salary", length = 255)
    private double salary;
    @Column(name = "Email", length = 255)
    private String email;
    @Column(name = "Password", length = 255)
    private String password;
    @Column(name = "Address", length = 255)
    private String address;

    // Constructor:
    public EmployeeData(int id, String name, String joiningDate, double salary, String email, String password, String address)
    {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
        this.salary = salary;
        this.email = email;
        this.password = password;
        this.address = address;
    }
    public EmployeeData() {}

    // Getter Method:
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
    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // to-String method:


    @Override
    public String toString() {
        return super.toString();
    }
}
