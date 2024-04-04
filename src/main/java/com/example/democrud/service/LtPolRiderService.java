package com.example.democrud.service;

import java.sql.SQLException;

import com.example.democrud.model.LT_POL_RIDER;

public interface LtPolRiderService {

	String createPolRider(LT_POL_RIDER polrider);

	String getAllPolRiderList() throws SQLException;

	String getPolRiderById(Long prTranId);

	String deletePolRiderById(Long prTranId);

}
