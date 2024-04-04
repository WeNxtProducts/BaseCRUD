package com.example.democrud.service;

import java.sql.SQLException;

import com.example.democrud.model.LT_CLAIM_PYMT;

public interface LtClaimPymtService {

	String createClaimPymt(LT_CLAIM_PYMT claimpymt);

	String getAllClaimPymtlist() throws SQLException;

	String getClaimPymtById(Long cpTRANId);

	String deleteClaimPymtByid(Long cpTRANId);

}
