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

import com.wenxt.crud.model.LT_POL_EMP_COVER;
import com.wenxt.crud.service.LtPolEmpCoverService;

@RestController
@RequestMapping("/empcover")
public class LtPolEmpCoverController {

	@Autowired
	private LtPolEmpCoverService coverservice;

	@PostMapping("/empcover_create")
	public String createEmpCover(@RequestBody LT_POL_EMP_COVER empcover) {
		return coverservice.createEmpCover(empcover);

	}

	@GetMapping("/empcover_list")
	public String getAllEmpCoverList() throws JSONException, SQLException {
		return coverservice.getAllEmpCoverList();
	}

	@GetMapping("empcoverId/{pecTranId}")
	public String getEmpCoverById(@PathVariable Long pecTranId) {
		return coverservice.getEmpCoverById(pecTranId);

	}

	@DeleteMapping("/deletempcoverId/{pecTranId}")
	public String deleteEmpCoverUserById(@PathVariable Long pecTranId) {
		return coverservice.deleteEmpCoverUserById(pecTranId);
	}

}
