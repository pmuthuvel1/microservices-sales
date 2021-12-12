package com.sales.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.sales.model.Sales;
import com.sales.sales.repo.SalesRepo;

@RestController
@RequestMapping("salesapi")
public class SalesController {
	
	@Autowired
    private SalesRepo salesRepo;
	
	@GetMapping("findAll")
    public List<Sales> findAll() {
        return salesRepo.findAll();
    }

	@PostMapping("create")
    public Sales create(@RequestBody Sales customer) {
        return salesRepo.save(customer);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
    	salesRepo.deleteById(id);
    }

    @PutMapping("update/{id}")
    public Sales updateCustomer(@RequestBody Sales pay, @PathVariable Long id) {        
        return salesRepo.save(pay);
    }
}
