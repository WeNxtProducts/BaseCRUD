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

import com.example.democrud.model.LM_CUST_DIVN;
import com.example.democrud.service.LmCustDivService;

@RestController
@RequestMapping("/lmcustdiv")
public class LmCustDivController {

	@Autowired
	private LmCustDivService lmservice;

	@PostMapping("/lmcust_creates")
	public String createLmClass(@RequestBody LM_CUST_DIVN LM_CUST_DIVN) {
		return lmservice.createLmClass(LM_CUST_DIVN);
	}

	@GetMapping("/lmcust_List")
	public String getAllLMClasslist() throws JSONException, SQLException {
		return lmservice.getAllLMClasslist();
	}

	@GetMapping("getlmcustlist/{cdivCustCode}")
	public String getLMUserById(@PathVariable String cdivCustCode) {
		return lmservice.getLMUserById(cdivCustCode);

	}

	@DeleteMapping("/deletes/{cdivCustCode}")
	public String deleteLmClasss(@PathVariable String cdivCustCode) {
		return lmservice.deleteLmClasss(cdivCustCode);
	}

}
