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

import com.wenxt.crud.model.LT_POL_EMPLOYEE;
import com.wenxt.crud.service.LtPolEmployeeService;

@RestController
@RequestMapping("/ltemployee")
public class LtPolEmployeeController {

	@Autowired
	private LtPolEmployeeService polemprepo;

	@PostMapping("/ltemployee_create")
	public String createPolemployee(@RequestBody LT_POL_EMPLOYEE polemployee) {
		return polemprepo.createPolemployee(polemployee);

	}

	@GetMapping("/ltemployee_list")
	public String getAllPolemployeeList() throws JSONException, SQLException {
		return polemprepo.getAllPolemployeeList();
	}

	@GetMapping("ltemployeeById/{pempTranId}")
	public String getPolemployeeListUserById(@PathVariable Long pempTranId) {
		return polemprepo.getPolemployeeListUserById(pempTranId);

	}

	@DeleteMapping("/deletltemployeeByid/{pempTranId}")
	public String deletePlEmployeeUserById(@PathVariable Long pempTranId) {
		return polemprepo.deletePlEmployeeUserById(pempTranId);
	}

}
