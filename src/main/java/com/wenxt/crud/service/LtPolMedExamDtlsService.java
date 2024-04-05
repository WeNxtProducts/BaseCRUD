package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_POL_MED_EXAM_DTL;

public interface LtPolMedExamDtlsService {

	String createMedExamDtl(LT_POL_MED_EXAM_DTL medExamdtl);

	String getAllMedExamDtlList() throws SQLException;

	String getMedExamDtlById(Long pMED_TRAN_ID);

	String deleteMedExamDtlById(Long pMED_TRAN_ID);

}
