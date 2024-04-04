package com.example.democrud.service;

import java.sql.SQLException;

import org.json.JSONException;

import com.example.democrud.model.LM_CUSTOMER;

public interface CustomerMasterService {

	String createCustomer(LM_CUSTOMER lM_CUSTOMER);

	String getAllCustomlist() throws JSONException, SQLException;

	String getCustomerUserById(int custcode);

	String deleteUserById(int custcode);

}