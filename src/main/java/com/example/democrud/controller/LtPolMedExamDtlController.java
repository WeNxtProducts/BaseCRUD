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

import com.example.democrud.model.LT_POL_MED_EXAM_DTL;
import com.example.democrud.service.LtPolMedExamDtlsService;

@RestController
@RequestMapping("/medExamdtl")
public class LtPolMedExamDtlController {
	


	@Autowired
	private LtPolMedExamDtlsService medexamdtlservice;

	@PostMapping("/medExamdtl_create")
	public String createMedExamDtl(@RequestBody LT_POL_MED_EXAM_DTL medExamdtl) {
		return medexamdtlservice.createMedExamDtl(medExamdtl);

	}

	@GetMapping("/medExamdtl_list")
	public String getAllMedExamDtlList() throws JSONException, SQLException {
		return medexamdtlservice.getAllMedExamDtlList();
	}

	@GetMapping("medExamdtlId/{PMED_TRAN_ID}")
	public String getMedExamDtlById(@PathVariable Long PMED_TRAN_ID) {
		return medexamdtlservice.getMedExamDtlById(PMED_TRAN_ID);

	}

	@DeleteMapping("/deletmedExamdtl/{PMED_TRAN_ID}")
	public String deleteMedExamDtlById(@PathVariable Long PMED_TRAN_ID) {
		return medexamdtlservice.deleteMedExamDtlById(PMED_TRAN_ID);
	}



}
