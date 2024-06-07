package com.example.services;

import com.example.dto.EmployeeDataDto;
import com.example.entities.EmployeeData;
import com.example.entities.Login;
import com.example.repository.EmployeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements com.example.services.Service
{
//    @Autowired
//    private EmployeeDataRepository employeeDataRepository;
//    private Login log;
//    @Autowired
//    public PasswordEncoder passwordEncoder;
//    @Override
//    public String setData(EmployeeDataDto employeeDataDto)
//    {
//        EmployeeData employeeData = new EmployeeData(
//                employeeDataDto.getId(),
//                employeeDataDto.getName(),
//                employeeDataDto.getJoiningDate(),
//                employeeDataDto.getSalary(),
//                employeeDataDto.getEmail(),
//                passwordEncoder.encode(employeeDataDto.getPassword()),
//                employeeDataDto.getAddress()
//        );
//        employeeDataRepository.save(employeeData);
//        return "Registration Successful !";
//    }
//
//    @Override
//    public String login(Login logIn) {
//        log = logIn;
//        EmployeeData data = employeeDataRepository.findEmployeeDataByEmail(logIn.getEmail());
//        if(data != null)
//        {
//            boolean flag = passwordEncoder.matches(logIn.getPassword(), data.getPassword());
//            if(flag == true)
//            {
//                return "Login Successful";
//            }
//            else
//            {
//                return "Incorrect Password";
//            }
//        }
//        else
//        {
//            return "email doesn't exit";
//        }
//    }
//
//    @Override
//    public EmployeeData getPersonalInformation(Login login)
//    {
//        EmployeeData data = employeeDataRepository.findEmployeeDataByEmail(login.getEmail());
//        return data;
//    }
//
//    @Override
//    public String changePassword(EmployeeData data)
//    {
//        EmployeeData employeeData = employeeDataRepository.findEmployeeDataByEmail(log.getEmail());
//        if(employeeData != null)
//        {
//            employeeData.setPassword(data.getPassword());
//            employeeDataRepository.save(employeeData);
//            return "Successful !";
//        }
//        return null;
//    }
}

