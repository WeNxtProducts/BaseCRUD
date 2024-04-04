package com.example.democrud.service;

import java.sql.SQLException;

import com.example.democrud.model.LT_POL_ASSRD_DET;

public interface LtPlAssrdDetService {

	String createLtpolAssrd(LT_POL_ASSRD_DET lT_POL_ASSRD_DET);

	String getAllLtPlAssrdDet() throws SQLException;

	String deleteLtPolAssrd(Long padTranId);

	String getLlPolassrdDtlUserById(Long padTranId);

}
