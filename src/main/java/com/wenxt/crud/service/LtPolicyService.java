package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_POLICY;

public interface LtPolicyService {

	String createPolicy(LT_POLICY ltpolicy);

	String getAllPolicyList() throws SQLException;

	String getPolicyUserById(Long polTranId);

	String deletePolicyUserById(Long polTranId);

	

}
