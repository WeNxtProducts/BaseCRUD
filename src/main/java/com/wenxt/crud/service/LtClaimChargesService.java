package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_CLAIM_CHARGES;

public interface LtClaimChargesService {

	String createClaimCharges(LT_CLAIM_CHARGES ltclaimChrgs);

	String getAllClaimChargeslist() throws SQLException;

	String getClaimChargesById(Long cc_TRAN_id);

	String deleteClaimChargesByid(Long cc_TRAN_id);

}
