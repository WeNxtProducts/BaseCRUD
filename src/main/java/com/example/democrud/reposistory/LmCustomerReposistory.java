package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LM_CUST_CLASS;

@Repository
public interface LmCustomerReposistory extends JpaRepository<LM_CUST_CLASS, String> {

}