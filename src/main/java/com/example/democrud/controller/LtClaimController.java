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

import com.example.democrud.model.LT_CLAIM;
import com.example.democrud.service.LtClaimService;

@RestController
@RequestMapping("/ltclaim")
public class LtClaimController {


	@Autowired
	private LtClaimService ltclaimservice;

	@PostMapping("/ltclaim_creates")
	public String createLtClaim(@RequestBody LT_CLAIM ltclaim) {
		return ltclaimservice.createLtClaim(ltclaim);
	}

	@GetMapping("/ltclaim_List")
	public String getAllLtClaimlist() throws JSONException, SQLException {
		return ltclaimservice.getAllLtClaimlist();
	}

	@GetMapping("getltclaimByid/{claim_TRAN_id}")
	public String getLtClaimById(@PathVariable Long claim_TRAN_id) {
		return ltclaimservice.getLtClaimById(claim_TRAN_id);

	}

	@DeleteMapping("/deletesltclaimByid/{claim_TRAN_id}")
	public String deleteLtClaimByid(@PathVariable Long claim_TRAN_id) {
		return ltclaimservice.deleteLtClaimByid(claim_TRAN_id);
	}


	
	

}
