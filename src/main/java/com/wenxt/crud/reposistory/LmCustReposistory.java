package com.wenxt.crud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.crud.model.LM_CUST_DIVN;

@Repository
public interface LmCustReposistory extends JpaRepository<LM_CUST_DIVN, String> {

}
