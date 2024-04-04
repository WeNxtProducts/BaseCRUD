package com.example.democrud.reposistory;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_POL_CHARGE;

@Repository
public interface PolChargeRepository extends JpaRepository<LT_POL_CHARGE, BigInteger> {

}