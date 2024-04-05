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

import com.wenxt.crud.model.LT_POL_ASSRD_DET;
import com.wenxt.crud.service.LtPlAssrdDetService;

@RestController
@RequestMapping("/ltplAssrd")
public class LtPlAssrdDetController {

	@Autowired
	private LtPlAssrdDetService ltplservice;

	@PostMapping("/ltpl_assued_creates")
	public String createLtpolAssrd(@RequestBody LT_POL_ASSRD_DET ltpolAssrdDet) {
		return ltplservice.createLtpolAssrd(ltpolAssrdDet);
	}

	@GetMapping("/ltplassuedList")
	public String getAllLtPlAssrdDet() throws JSONException, SQLException {
		return ltplservice.getAllLtPlAssrdDet();
	}

	@GetMapping("getltpl_assued/{padTranId}")
	public String getLlPolassrdDtlUserById(@PathVariable Long padTranId) {
		return ltplservice.getLlPolassrdDtlUserById(padTranId);

	}

	@DeleteMapping("/ltpl_assued/{padTranId}")
	public String deleteLtPolAssrd(@PathVariable Long padTranId) {
		return ltplservice.deleteLtPolAssrd(padTranId);
	}

}
