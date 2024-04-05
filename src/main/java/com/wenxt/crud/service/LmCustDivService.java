package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LM_CUST_DIVN;

public interface LmCustDivService {

	String createLmClass(LM_CUST_DIVN lM_CUST_DIVN);

	String getAllLMClasslist() throws SQLException;

	String getLMUserById(String cDIV_DIVN_CODE);

	String deleteLmClasss(String cDIV_DIVN_CODE);

}
