package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_CLAIM;

public interface LtClaimService {

	String createLtClaim(LT_CLAIM ltclaim);

	String getAllLtClaimlist() throws SQLException;

	String getLtClaimById(Long claim_TRAN_id);

	String deleteLtClaimByid(Long claim_TRAN_id);

}
