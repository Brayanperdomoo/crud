package com.sena.crud_basic.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.model.employeeDTO;
import com.sena.crud_basic.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //método para crear un registro POST
    @PostMapping("/")
    public String registerCustomer(
        @RequestBody employeeDTO customer
        ){
            customerService.save(customer);
        return "register ok";
    }






}
