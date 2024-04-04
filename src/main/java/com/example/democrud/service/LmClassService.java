package com.example.democrud.service;

import java.sql.SQLException;

import org.json.JSONException;

import com.example.democrud.model.LM_CUST_CLASS;

public interface LmClassService {

	String createLmClass(LM_CUST_CLASS lM_CUST_CLASS);

	String getAllLMClasslist() throws JSONException, SQLException;

	String deleteLmClasss(String cCLAS_CODE);

	String getLMUserById(String cCLAS_CODE);

}
