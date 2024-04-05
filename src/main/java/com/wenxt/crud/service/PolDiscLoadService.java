package com.wenxt.crud.service;

import java.math.BigInteger;
import java.sql.SQLException;

import com.wenxt.crud.model.LT_POL_DISCLOAD;

public interface PolDiscLoadService {

	String createPoldisc(LT_POL_DISCLOAD poldiscload);

	String getAllPoldiscList() throws SQLException;

	String getPoldiscUserById(BigInteger pdTranId);

	String deleteCreatePoldiscUserById(BigInteger pdTranId);

}
