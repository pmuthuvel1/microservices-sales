package com.sales.sales.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.sales.model.Sales;

public interface SalesRepo extends JpaRepository<Sales, Long>  {

}