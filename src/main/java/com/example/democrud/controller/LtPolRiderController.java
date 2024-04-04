package com.example.democrud.controller;

import java.sql.SQLException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrud.model.LT_POL_RIDER;
import com.example.democrud.service.LtPolRiderService;

@RestController
@RequestMapping("/polrider")
public class LtPolRiderController {
	
	@Autowired
	private LtPolRiderService polriderservice;
	
	@PostMapping("/polrider_create")
	public String createPolRider(@RequestBody LT_POL_RIDER polrider) {
		return polriderservice.createPolRider(polrider);

	}

	@GetMapping("/polrider_list")
	public String getAllPolRiderList() throws JSONException, SQLException {
		return polriderservice.getAllPolRiderList();
	}

	@GetMapping("polriderId/{prTranId}")
	public String getPolRiderById(@PathVariable Long prTranId) {
		return polriderservice.getPolRiderById(prTranId);

	}

	@DeleteMapping("/deletpolriderId/{prTranId}")
	public String deletePolRiderById(@PathVariable Long prTranId) {
		return polriderservice.deletePolRiderById(prTranId);
	}

}
