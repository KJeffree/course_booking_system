package com.example.coursebookingsystem.controllers;

import com.example.coursebookingsystem.models.Customer;
import com.example.coursebookingsystem.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{courseId}")
    public List<Customer> getAllCustomersForGivenCourse(@PathVariable Long courseId){
        return customerRepository.getAllCustomersForGivenCourse(courseId);
    }

}
