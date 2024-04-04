package com.example.democrud.service;

import java.sql.SQLException;

import com.example.democrud.model.LT_POL_NOMINEE;

public interface LtPolNomineeService {

	String createPolNominee(LT_POL_NOMINEE polnominee);

	String getAllPolNomineeList() throws SQLException;

	String getPolNomineeById(Long pN_TRAN_ID);

	String deletePolNomineeById(Long pN_TRAN_ID);

}
