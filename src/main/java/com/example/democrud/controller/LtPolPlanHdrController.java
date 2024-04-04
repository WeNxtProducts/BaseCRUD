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

import com.example.democrud.model.LT_POL_PLAN_HDR;
import com.example.democrud.service.LtPolPlanHdrService;

@RestController
@RequestMapping("/ltplanhdr")
public class LtPolPlanHdrController {

	@Autowired
	private LtPolPlanHdrService ltplanhdrservice;

	@PostMapping("/ltplanhdr_create")
	public String createPolPlanhrd(@RequestBody LT_POL_PLAN_HDR polplanhdr) {
		return ltplanhdrservice.createPolPlanhrd(polplanhdr);
	}

	@GetMapping("/ltplanhdr_list")
	public String getAllPlanhdrList() throws JSONException, SQLException {
		return ltplanhdrservice.getAllPlanhdrList();
	}

	@GetMapping("ltplanhdrByid/{pph_tran_id}")
	public String getPlanHdrById(@PathVariable Integer pph_tran_id) {
		return ltplanhdrservice.getPlanHdrById(pph_tran_id);

	}

	@DeleteMapping("/deleteByidltplanhdr/{pph_tran_id}")
	public String deletePlanHdrById(@PathVariable Integer pph_tran_id) {
		return ltplanhdrservice.deletePlanHdrById(pph_tran_id);
	}

}
