package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_POL_ASSRD_DET;

public interface LtPlAssrdDetService {

	String createLtpolAssrd(LT_POL_ASSRD_DET lT_POL_ASSRD_DET);

	String getAllLtPlAssrdDet() throws SQLException;

	String deleteLtPolAssrd(Long padTranId);

	String getLlPolassrdDtlUserById(Long padTranId);

}
