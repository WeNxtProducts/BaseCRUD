package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_POL_BROKER_DTL;

@Repository
public interface LtPolBrokerDtlRepository extends JpaRepository<LT_POL_BROKER_DTL, Long> {

}
