package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "client")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

//    @GetMapping
//    public List<Customer> getOrders(){
//        return customerService.getOrders();
//    }

    @GetMapping
    public ResponseEntity<List<Customer>> getOrders(){
        return ResponseEntity.ok(customerService.getOrders());
    }

    @PostMapping
    public Customer addCustomer (@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    };

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id){
        return customerService.findbyID(id);
    }
}
