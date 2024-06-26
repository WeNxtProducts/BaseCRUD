package com.wenxt.crud.service;

import java.math.BigInteger;
import java.sql.SQLException;

import com.wenxt.crud.model.LT_POL_CHARGE;

public interface PolChargeService {

	String createPolchage(LT_POL_CHARGE polcharge);

	String getAllpolchagerList() throws SQLException;

	String getpolchagerUserById(BigInteger pocTranId);

	String deletePolchagerUserById(BigInteger pocTranId);

}
