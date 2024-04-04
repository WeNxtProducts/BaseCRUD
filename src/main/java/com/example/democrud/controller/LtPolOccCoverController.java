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

import com.example.democrud.model.LT_POL_OCC_COVER;
import com.example.democrud.service.LtPolOccCoverService;

@RestController
@RequestMapping("poloccCover")
public class LtPolOccCoverController {
	
	@Autowired
	private LtPolOccCoverService ocoverservice;
	
	@PostMapping("/poloccCover_create")
	public String createPolOCover(@RequestBody LT_POL_OCC_COVER polocover) {
		return ocoverservice.createPolOCover(polocover);
	}
	
	@GetMapping("/poloccCover_list")
	public String getAllPolOCoverList() throws JSONException, SQLException {
		return ocoverservice.getAllPolOCoverList();
	}

	@GetMapping("poloccCoverByid/{pocvr_tran_id}")
	public String getPolOCoverById(@PathVariable Long pocvr_tran_id) {
		return ocoverservice.getPolOCoverById(pocvr_tran_id);

	}

	@DeleteMapping("/deleteByidpoloccCover/{pocvr_tran_id}")
	public String deletePolOCoverById(@PathVariable Long pocvr_tran_id) {
		return ocoverservice.deletePolOCoverById(pocvr_tran_id);
	}
}
