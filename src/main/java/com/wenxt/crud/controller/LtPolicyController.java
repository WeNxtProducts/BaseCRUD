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

import com.wenxt.crud.model.LT_POLICY;
import com.wenxt.crud.service.LtPolicyService;

@RestController
@RequestMapping("/ltpolicy")
public class LtPolicyController {

	@Autowired
	private LtPolicyService ltpolciy;
	

	@PostMapping("/ltpolicy_create")
	public String createPolicy(@RequestBody LT_POLICY ltpolicy) {
		return ltpolciy.createPolicy(ltpolicy);

	}

	@GetMapping("/ltpolicy_list")
	public String getAllPolicyList() throws JSONException, SQLException {
		return ltpolciy.getAllPolicyList();
	}

	@GetMapping("ltpolicyByid/{pol_tran_id}")
	public String getPolicyUserById(@PathVariable Long pol_tran_id) {
		return ltpolciy.getPolicyUserById(pol_tran_id);

	}

	@DeleteMapping("/deletltpolicyByid/{pol_tran_id}")
	public String deletePolicyUserById(@PathVariable Long pol_tran_id) {
		return ltpolciy.deletePolicyUserById(pol_tran_id);
	}

}
