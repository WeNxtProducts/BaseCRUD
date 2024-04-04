package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LM_CUSTOMER;

@Repository
public interface CustomerRepository extends JpaRepository<LM_CUSTOMER, Integer> {

}