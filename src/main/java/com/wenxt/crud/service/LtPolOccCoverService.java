package com.wenxt.crud.service;

import java.sql.SQLException;

import com.wenxt.crud.model.LT_POL_OCC_COVER;

public interface LtPolOccCoverService {

	String createPolOCover(LT_POL_OCC_COVER polocover);

	String getAllPolOCoverList() throws SQLException;

	String getPolOCoverById(Long pocvr_tran_id);

	String deletePolOCoverById(Long pocvr_tran_id);

}
