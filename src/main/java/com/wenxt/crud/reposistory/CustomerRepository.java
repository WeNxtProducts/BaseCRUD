package com.wenxt.crud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.crud.model.LM_CUSTOMER;

@Repository
public interface CustomerRepository extends JpaRepository<LM_CUSTOMER, Integer> {

}