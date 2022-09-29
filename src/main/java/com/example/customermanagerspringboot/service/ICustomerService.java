package com.example.customermanagerspringboot.service;

import com.example.customermanagerspringboot.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneralService<Customer>{
    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
    Page<Customer> findAll (Pageable pageable);
}
