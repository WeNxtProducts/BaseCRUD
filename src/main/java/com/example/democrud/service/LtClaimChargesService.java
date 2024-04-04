package com.example.democrud.service;

import java.sql.SQLException;

import com.example.democrud.model.LT_CLAIM_CHARGES;

public interface LtClaimChargesService {

	String createClaimCharges(LT_CLAIM_CHARGES ltclaimChrgs);

	String getAllClaimChargeslist() throws SQLException;

	String getClaimChargesById(Long cc_TRAN_id);

	String deleteClaimChargesByid(Long cc_TRAN_id);

}
