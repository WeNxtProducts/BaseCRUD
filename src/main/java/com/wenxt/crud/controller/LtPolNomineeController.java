package com.wenxt.crud.controller;

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

import com.wenxt.crud.model.LT_POL_NOMINEE;
import com.wenxt.crud.service.LtPolNomineeService;

@RestController
@RequestMapping("/polNominee")
public class LtPolNomineeController {

	@Autowired
	private LtPolNomineeService polnomineeserivce;

	@PostMapping("/polnominee_create")
	public String createPolNominee(@RequestBody LT_POL_NOMINEE polnominee) {
		return polnomineeserivce.createPolNominee(polnominee);

	}

	@GetMapping("/polnominee_list")
	public String getAllPolNomineeList() throws JSONException, SQLException {
		return polnomineeserivce.getAllPolNomineeList();
	}

	@GetMapping("polnomineeId/{PN_TRAN_ID}")
	public String getPolNomineeById(@PathVariable Long PN_TRAN_ID) {
		return polnomineeserivce.getPolNomineeById(PN_TRAN_ID);

	}

	@DeleteMapping("/deletpolnominee/{PN_TRAN_ID}")
	public String deletePolNomineeById(@PathVariable Long PN_TRAN_ID) {
		return polnomineeserivce.deletePolNomineeById(PN_TRAN_ID);
	}

}
