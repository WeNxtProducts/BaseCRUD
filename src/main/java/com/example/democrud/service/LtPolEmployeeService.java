package com.example.democrud.service;

import java.sql.SQLException;

import com.example.democrud.model.LT_POL_EMPLOYEE;

public interface LtPolEmployeeService {

	String getAllPolemployeeList() throws SQLException;

	String createPolemployee(LT_POL_EMPLOYEE polemployee);

	String getPolemployeeListUserById(Long pempTranId);

	String deletePlEmployeeUserById(Long pempTranId);

}
