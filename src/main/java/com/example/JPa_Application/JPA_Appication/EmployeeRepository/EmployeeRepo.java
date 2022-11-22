package com.example.JPa_Application.JPA_Appication.EmployeeRepository;

import com.example.JPa_Application.JPA_Appication.Entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

    public interface EmployeeRepo extends  PagingAndSortingRepository<Employee,Integer> {

        List<Employee> findByName(String name);
        List<Employee> findByNameStartingWith(Character name);

        List<Employee> findByAgeBetween(int min,int max);


    }

