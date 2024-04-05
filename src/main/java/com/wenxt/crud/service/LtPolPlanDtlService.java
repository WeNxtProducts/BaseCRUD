package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_POL_PLAN_DTL;

public interface LtPolPlanDtlService {

	String createPolPlandtl(LT_POL_PLAN_DTL polplandtl);

	String getAllPlanList() throws SQLException;

	String getPlanDtlById(Long pPD_TRAN_ID);

	String deletePlandtlById(Long pPD_TRAN_ID);

}
