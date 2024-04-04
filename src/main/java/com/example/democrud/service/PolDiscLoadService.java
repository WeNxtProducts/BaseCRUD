package com.example.democrud.service;

import java.math.BigInteger;
import java.sql.SQLException;

import com.example.democrud.model.LT_POL_DISCLOAD;

public interface PolDiscLoadService {

	String createPoldisc(LT_POL_DISCLOAD poldiscload);

	String getAllPoldiscList() throws SQLException;

	String getPoldiscUserById(BigInteger pdTranId);

	String deleteCreatePoldiscUserById(BigInteger pdTranId);

}
