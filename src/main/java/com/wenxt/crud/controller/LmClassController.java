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

import com.wenxt.crud.model.LM_CUST_CLASS;
import com.wenxt.crud.service.LmClassService;

@RestController
@RequestMapping("/lmclass")
public class LmClassController {
	@Autowired
	private LmClassService service;

	@PostMapping("/creates")
	public String createLmClass(@RequestBody LM_CUST_CLASS LM_CUST_CLASS) {
		return service.createLmClass(LM_CUST_CLASS);
	}

	@GetMapping("/lmList")
	public String getAllLMClasslist() throws JSONException, SQLException {
		return service.getAllLMClasslist();
	}

	@GetMapping("getcustomer/{cclasType}")
	public String getLMUserById(@PathVariable String cclasType) {
		return service.getLMUserById(cclasType);

	}

	@DeleteMapping("/deletes/{cclasType}")
	public String deleteLmClasss(@PathVariable String cclasType) {
		return service.deleteLmClasss(cclasType);
	}

}
