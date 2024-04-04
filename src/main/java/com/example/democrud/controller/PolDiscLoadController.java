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

import com.example.democrud.model.LT_POL_DISCLOAD;
import com.example.democrud.service.PolDiscLoadService;

@RestController
@RequestMapping("/Poldiscload")
public class PolDiscLoadController {

	@Autowired
	private PolDiscLoadService poldiscservice;

	@PostMapping("/Poldiscload_create")
	public String createPoldisc(@RequestBody LT_POL_DISCLOAD poldiscload) {
		return poldiscservice.createPoldisc(poldiscload);

	}

	@GetMapping("/Poldiscload_list")
	public String getAllPoldiscList() throws JSONException, SQLException {
		return poldiscservice.getAllPoldiscList();
	}

	@GetMapping("PoldiscloadId/{pdTranId}")
	public String getPoldiscUserById(@PathVariable BigInteger pdTranId) {
		return poldiscservice.getPoldiscUserById(pdTranId);

	}

	@DeleteMapping("/deletPoldiscload/{pdTranId}")
	public String deleteCreatePoldiscUserById(@PathVariable BigInteger pdTranId) {
		return poldiscservice.deleteCreatePoldiscUserById(pdTranId);
	}

}
