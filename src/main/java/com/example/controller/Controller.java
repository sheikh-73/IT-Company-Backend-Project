package com.example.controller;

import com.example.dto.EmployeeDataDto;
import com.example.entities.EmployeeData;
import com.example.entities.Login;
import com.example.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Controller
{
    @Autowired
    private Service service;

    @GetMapping("/msg")
    private String getMsg()
    {
        return "Server Connected !";
    }

//    @PostMapping("/registration")
//    private String setData(@RequestBody EmployeeDataDto employeeDataDto)
//    {
//        return this.service.setData(employeeDataDto);
//    }
//
//    @GetMapping("/login")
//    private String login(@RequestBody Login logIn)
//    {
//        return this.service.login(logIn);
//    }
//
//    @GetMapping("/login/personalInformation")
//    private EmployeeData getPersonalInformation(@RequestBody Login login)
//    {
//        return this.service.getPersonalInformation(login);
//    }
//
//    @PutMapping("/login/changePassword")
//    private String changePassword(@RequestBody EmployeeData data)
//    {
//        return this.service.changePassword(data);
//    }
}
