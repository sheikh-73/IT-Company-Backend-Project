package com.example.repository;

import com.example.entities.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface EmployeeDataRepository extends JpaRepository<EmployeeData, Integer>
{
    public EmployeeData findEmployeeDataByEmail(String email);
}
