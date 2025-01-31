package com.example.account.service;

import com.example.account.dto.CustomerDto;
import com.example.account.dto.CustomerDtoConverter;
import com.example.account.exception.CustomerNotFoundException;
import com.example.account.model.Customer;
import com.example.account.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter converter;

    public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter converter) {
        this.customerRepository = customerRepository;
        this.converter = converter;
    }
    protected Customer findCustomerById(String id){
        return customerRepository.findById(id).
                orElseThrow(() ->new CustomerNotFoundException("Customer could not find by id: "+id));
    }

    public CustomerDto getCustomerByID(String customerId){

        return converter.convertToCustomerDto(findCustomerById(customerId));
    }
}
