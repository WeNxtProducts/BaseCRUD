package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_POL_BROKER_DTL;

public interface LtPolBrokerDtlService {

	String createLtpolbroker(LT_POL_BROKER_DTL ll_POL_BROKER_DTL);

	String getAllLtPlBrokerDtl() throws SQLException;

	String getLlPolBrokerUserById(Long pOBD_TRAN_ID);

	String deleteLtPolBrokerdtl(Long pOBD_TRAN_ID);

}
