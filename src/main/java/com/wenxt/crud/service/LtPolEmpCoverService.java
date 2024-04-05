package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_POL_EMP_COVER;

public interface LtPolEmpCoverService {

	String createEmpCover(LT_POL_EMP_COVER empcover);

	String getAllEmpCoverList() throws SQLException;

	String getEmpCoverById(Long pecTranId);

	String deleteEmpCoverUserById(Long pecTranId);


	

	

}
