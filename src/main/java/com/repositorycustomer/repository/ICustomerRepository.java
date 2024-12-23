package com.repositorycustomer.repository;

import com.repositorycustomer.model.Customer;
import com.repositorycustomer.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository  extends CrudRepository<Customer,Integer> {
    Iterable<Customer> findAllByProvince(Province province);
}
