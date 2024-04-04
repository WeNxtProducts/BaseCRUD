package com.example.democrud.service;

import java.sql.SQLException;

import com.example.democrud.model.LT_POL_STATUS;

public interface LtPolStatusService {

	String createPolchage(LT_POL_STATUS polstatus);

	String getAllPolStatusList() throws SQLException;

	String getPolStatusUserById(Integer psTranId);

	String deletPolStatusById(Integer psTranId);

}
