package com.example.demo;

import com.example.demo.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}


}
