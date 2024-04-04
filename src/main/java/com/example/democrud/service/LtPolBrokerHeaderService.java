package com.example.democrud.service;

import java.math.BigInteger;
import java.sql.SQLException;

import com.example.democrud.model.LT_POL_BROKER_HEAD;

public interface LtPolBrokerHeaderService {

	String createLtpolbrokerHead(LT_POL_BROKER_HEAD lt_POL_BROKER_HEAD);

	String getAllLtPlBrokerHeader() throws SQLException;

	String deleteLlPolBrokerHeaderUserById(BigInteger pOBH_TRAN_ID);

	String getLlPolBrokerHeaderUserById(BigInteger pOBH_TRAN_ID);

}
