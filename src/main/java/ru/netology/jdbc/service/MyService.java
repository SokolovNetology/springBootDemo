package ru.netology.jdbc.service;

import org.springframework.stereotype.Service;
import ru.netology.jdbc.model.Customer;
import ru.netology.jdbc.model.Order;
import ru.netology.jdbc.repository.MyRep;


@Service
public class MyService {
    private final MyRep repository;

    public MyService(MyRep repository) {
        this.repository = repository;
    }

    public String getProductName(String name) {
        return repository.getProductName(name);
    }

    public Integer addCustomer(Customer customer) {
        return repository.addCustomer(customer);
    }

    public Integer addOrder(Order order) {
        return repository.addOrder(order);
    }

}