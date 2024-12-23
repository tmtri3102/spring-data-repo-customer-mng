package com.repositorycustomer.service;

import com.repositorycustomer.model.Customer;
import com.repositorycustomer.model.Province;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
