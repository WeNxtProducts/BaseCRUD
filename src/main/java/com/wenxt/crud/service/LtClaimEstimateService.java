package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_CLAIM_ESTIMATE;

public interface LtClaimEstimateService {

	String createLtClaimEst(LT_CLAIM_ESTIMATE ltclaimest);

	String getAllLtClaimEstlist() throws SQLException;

	String getLtClaimEstById(Long ce_TRAN_id);

	String deleteLtClaimEstByid(Long ce_TRAN_id);

}
