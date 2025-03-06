package com.example.bankmanagementsystem.Controller;

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
    public String addCustomer(@RequestBody Customers customer) {
        bank.add(customer);
        return "Customer added successfully";
    }

    //    Update customers
    @PutMapping("/update/{id}")
    public String updateCustomer(@PathVariable int id, @RequestBody Customers updatedCustomer) {
        for (Customers customer : bank) {
            if (customer.getId() == id) {
                customer.setUserName(updatedCustomer.getUserName());
                customer.setBalance(updatedCustomer.getBalance());
                return "Customer updated successfully";
            }
        }
        return "Customer not found";
    }

    //    Delete customers
    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getId() == id) {
                bank.remove(i);
                return "Customer deleted successfully!";
            }
        }
        return "Customer not found";
    }


    //    Deposit money to customer
    @PatchMapping("/deposit/{id}/{amount}")
    public String depositMoney(@PathVariable int id, @PathVariable double amount) {
        for (Customers customer : bank) {
            if (customer.getId() == id) {
                customer.setBalance(customer.getBalance() + amount);
                return "Deposited " + amount + "RS successfully";
            }
        }
        return "Customer not found";
    }

    //    Withdraw money from customers
    @PatchMapping("/withdraw/{id}/{amount}")
    public String withdrawMoney(@PathVariable int id, @PathVariable double amount) {
        for (Customers customer : bank) {
            if (customer.getId() == id && customer.getBalance() >= amount) {
                customer.setBalance(customer.getBalance() - amount);
                return "Withdrew " + amount + " RS successfully";
            }
        }
        return "Customer not found";
    }
}
