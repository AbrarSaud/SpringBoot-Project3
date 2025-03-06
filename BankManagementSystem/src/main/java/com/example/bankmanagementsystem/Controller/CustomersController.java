package com.example.bankmanagementsystem.Controller;

import com.example.bankmanagementsystem.Api.ApiResponse;
import com.example.bankmanagementsystem.Model.Customers;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/bank")
public class CustomersController {
    ArrayList<Customers> bank = new ArrayList<>();

    // Get all the customers
    @GetMapping("/get")
    public ArrayList<Customers> getAllCustomers() {
        return bank;
    }

    // Add new customers
    @PostMapping("/add")
    public ApiResponse addCustomer(@RequestBody Customers customer) {
        bank.add(customer);
        return new ApiResponse("Customer added successfully");
    }

    //    Update customers
    @PutMapping("/update/{id}")
    public ApiResponse updateCustomer(@PathVariable int id, @RequestBody Customers updatedCustomer) {
        for (Customers customer : bank) {
            if (customer.getId() == id) {
                customer.setUserName(updatedCustomer.getUserName());
                customer.setBalance(updatedCustomer.getBalance());
                return new ApiResponse("Customer updated successfully!");
            }
        }
        return new ApiResponse("Customer not found");
    }

    //    Delete customers
    @DeleteMapping("/delete/{id}")
    public ApiResponse deleteCustomer(@PathVariable int id) {
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getId() == id) {
                bank.remove(i);
                return new ApiResponse("Customer deleted successfully!");
            }
        }
        return new ApiResponse("Customer not found");
    }


    //    Deposit money to customer
    @PatchMapping("/deposit/{id}/{amount}")
    public ApiResponse depositMoney(@PathVariable int id, @PathVariable double amount) {
        for (Customers customer : bank) {
            if (customer.getId() == id) {
                customer.setBalance(customer.getBalance() + amount);
                return new ApiResponse("Deposited " + amount + "RS successfully");
            }
        }
        return new ApiResponse("Customer not found");
    }

    //    Withdraw money from customers
    @PatchMapping("/withdraw/{id}/{amount}")
    public ApiResponse withdrawMoney(@PathVariable int id, @PathVariable double amount) {
        for (Customers customer : bank) {
            if (customer.getId() == id && customer.getBalance() >= amount) {
                customer.setBalance(customer.getBalance() - amount);
                return new ApiResponse("Withdrew " + amount + " RS successfully");
            }
        }
        return new ApiResponse("Customer not found");
    }
}
