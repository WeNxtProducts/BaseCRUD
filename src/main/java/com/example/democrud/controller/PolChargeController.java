package com.example.democrud.controller;

import java.math.BigInteger;
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

import com.example.democrud.model.LT_POL_CHARGE;
import com.example.democrud.service.PolChargeService;

@RestController
@RequestMapping("/polcharge")
public class PolChargeController {

	@Autowired
	private PolChargeService polchargeservice;

	@PostMapping("/polcharger_create")
	public String createPolchage(@RequestBody LT_POL_CHARGE polcharge) {
		return polchargeservice.createPolchage(polcharge);

	}

	@GetMapping("/polcharger_list")
	public String getAllpolchagerList() throws JSONException, SQLException {
		return polchargeservice.getAllpolchagerList();
	}

	@GetMapping("polchargerId/{pocTranId}")
	public String getpolchagerUserById(@PathVariable BigInteger pocTranId) {
		return polchargeservice.getpolchagerUserById(pocTranId);

	}

	@DeleteMapping("/deletpolchager/{pocTranId}")
	public String deletePolchagerUserById(@PathVariable BigInteger pocTranId) {
		return polchargeservice.deletePolchagerUserById(pocTranId);
	}

}
