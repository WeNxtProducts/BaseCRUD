package com.wenxt.crud.controller;

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

import com.wenxt.crud.model.LT_POL_BROKER_HEAD;
import com.wenxt.crud.service.LtPolBrokerHeaderService;

@RestController
@RequestMapping("/ltpolbrokerHead")
public class LtPolBrokerHeaderController {

	@Autowired
	private LtPolBrokerHeaderService ltbrokerHdserive;

	@PostMapping("/ltpl_brokerHead_creates")
	public String createLtpolbrokerHead(@RequestBody LT_POL_BROKER_HEAD Lt_POL_BROKER_HEAD) {
		return ltbrokerHdserive.createLtpolbrokerHead(Lt_POL_BROKER_HEAD);
	}

	@GetMapping("/ltpl_brokerHeadList")
	public String getAllLtPlBrokerHeader() throws JSONException, SQLException {
		return ltbrokerHdserive.getAllLtPlBrokerHeader();
	}

	@GetMapping("getltpl_brokerHead/{POBH_TRAN_ID}")
	public String getLlPolBrokerHeaderUserById(@PathVariable BigInteger POBH_TRAN_ID) {
		return ltbrokerHdserive.getLlPolBrokerHeaderUserById(POBH_TRAN_ID);

	}

	@DeleteMapping("/deleteltpl_brokerHead/{POBH_TRAN_ID}")
	public String deleteLlPolBrokerHeaderUserById(@PathVariable BigInteger POBH_TRAN_ID) {
		return ltbrokerHdserive.deleteLlPolBrokerHeaderUserById(POBH_TRAN_ID);
	}

}
