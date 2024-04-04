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

import com.example.democrud.model.LT_POL_BROKER_DTL;
import com.example.democrud.service.LtPolBrokerDtlService;

@RestController
@RequestMapping("/ltpolbrokerdtl")
public class LtPolBrokerDtlController {

	@Autowired
	private LtPolBrokerDtlService ltbrokerservice;

	@PostMapping("/ltpl_assued_creates")
	public String createLtpolbroker(@RequestBody LT_POL_BROKER_DTL Ll_POL_BROKER_DTL) {
		return ltbrokerservice.createLtpolbroker(Ll_POL_BROKER_DTL);
	}

	@GetMapping("/ltplassuedList")
	public String getAllLtPlBrokerDtl() throws JSONException, SQLException {
		return ltbrokerservice.getAllLtPlBrokerDtl();
	}

	@GetMapping("getltpl_assued/{POBD_TRAN_ID}")
	public String getLlPolBrokerUserById(@PathVariable Long POBD_TRAN_ID) {
		return ltbrokerservice.getLlPolBrokerUserById(POBD_TRAN_ID);

	}

	@DeleteMapping("/ltpl_assued/{POBD_TRAN_ID}")
	public String deleteLtPolBrokerdtl(@PathVariable Long POBD_TRAN_ID) {
		return ltbrokerservice.deleteLtPolBrokerdtl(POBD_TRAN_ID);
	}

}
