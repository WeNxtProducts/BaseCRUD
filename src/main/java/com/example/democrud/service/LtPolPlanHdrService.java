package com.example.democrud.service;

import java.sql.SQLException;

import com.example.democrud.model.LT_POL_PLAN_HDR;

public interface LtPolPlanHdrService {

	
	String createPolPlanhrd(LT_POL_PLAN_HDR polplanhdr);

	String getAllPlanhdrList() throws SQLException;

	String getPlanHdrById(Integer pph_tran_id);

	String deletePlanHdrById(Integer pph_tran_id);

	

	

	

}
