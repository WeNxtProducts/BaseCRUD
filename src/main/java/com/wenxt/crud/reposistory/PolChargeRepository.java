package com.wenxt.crud.reposistory;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.crud.model.LT_POL_CHARGE;

@Repository
public interface PolChargeRepository extends JpaRepository<LT_POL_CHARGE, BigInteger> {

}