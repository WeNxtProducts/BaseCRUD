package com.example.democrud.service;

import java.sql.SQLException;

import com.example.democrud.model.LT_POLICY;

public interface LtPolicyService {

	String createPolicy(LT_POLICY ltpolicy);

	String getAllPolicyList() throws SQLException;

	String getPolicyUserById(Long polTranId);

	String deletePolicyUserById(Long polTranId);

	

}
