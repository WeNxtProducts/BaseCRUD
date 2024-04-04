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

import com.example.democrud.model.LT_POL_PLAN_DTL;
import com.example.democrud.service.LtPolPlanDtlService;

@RestController
@RequestMapping("Ltplandtl")
public class LtPolPlanDtlController {

	@Autowired
	private LtPolPlanDtlService ltplandtlservice;

		@PostMapping("/Ltplandtl_create")
		public String createPolPlandtl(@RequestBody LT_POL_PLAN_DTL polplandtl) {
			return ltplandtlservice.createPolPlandtl(polplandtl);
		}
		@GetMapping("/Ltplandtl_list")
		public String getAllPlanList() throws JSONException, SQLException {
			return ltplandtlservice.getAllPlanList();
		}

		@GetMapping("LtplandtlByid/{PPD_TRAN_ID}")
		public String getPlanDtlById(@PathVariable Long PPD_TRAN_ID) {
			return ltplandtlservice.getPlanDtlById(PPD_TRAN_ID);

		}

		@DeleteMapping("/deleteByidLtplandtl/{PPD_TRAN_ID}")
		public String deletePlandtlById(@PathVariable Long PPD_TRAN_ID) {
			return ltplandtlservice.deletePlandtlById(PPD_TRAN_ID);
		}
		
		


}