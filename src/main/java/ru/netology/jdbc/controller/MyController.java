package ru.netology.jdbc.controller;
import org.springframework.web.bind.annotation.*;
import ru.netology.jdbc.model.Customer;
import ru.netology.jdbc.model.Order;
import ru.netology.jdbc.service.MyService;

@RestController
public class MyController {
    private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @PostMapping("add/customer")
    public Integer addCustomer(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }

    @PostMapping("add/order")
    public Integer addOrder(@RequestBody Order order) {
        return service.addOrder(order);
    }

    @GetMapping("products/fetch-product")
    @ResponseBody
    public String getProductName(@RequestParam String name) {
        return service.getProductName(name);
    }
}
