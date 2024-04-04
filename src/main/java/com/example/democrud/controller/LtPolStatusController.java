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

import com.example.democrud.model.LT_POL_STATUS;
import com.example.democrud.service.LtPolStatusService;

@RestController
@RequestMapping("ltpolstatus")
public class LtPolStatusController {
	


	@Autowired
	private LtPolStatusService ltstatusservice;

	@PostMapping("/ltpolstatus_create")
	public String createPolStatus(@RequestBody LT_POL_STATUS polstatus) {
		return ltstatusservice.createPolchage(polstatus);

	}

	@GetMapping("/ltpolstatus_list")
	public String getAllPolStatusList() throws JSONException, SQLException {
		return ltstatusservice.getAllPolStatusList();
	}

	@GetMapping("ltpolstatusId/{psTranId}")
	public String getPolStatusUserById(@PathVariable Integer psTranId) {
		return ltstatusservice.getPolStatusUserById(psTranId);

	}

	@DeleteMapping("/deletltpolstatusByid/{psTranId}")
	public String deletPolStatusById(@PathVariable Integer psTranId) {
		return ltstatusservice.deletPolStatusById(psTranId);
	}



}
