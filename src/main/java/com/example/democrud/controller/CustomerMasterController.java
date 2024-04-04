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

import com.example.democrud.model.LM_CUSTOMER;
import com.example.democrud.service.CustomerMasterService;

@RestController
@RequestMapping("/customer")
public class CustomerMasterController {

	@Autowired
	private CustomerMasterService custom;

	@PostMapping("/create")
	public String createCustomer(@RequestBody LM_CUSTOMER LM_CUSTOMER) {
		return custom.createCustomer(LM_CUSTOMER);
	}

	@GetMapping("/customerList")
	public String getAllCustomlist() throws JSONException, SQLException {
		return custom.getAllCustomlist();
	}

	@GetMapping("getcustomer/{custcode}")
	public String getCustomerUserById(@PathVariable int custcode) {
		return custom.getCustomerUserById(custcode);

	}

	@DeleteMapping("/deletes/{custcode}")
	public String deleteUser(@PathVariable int custcode) {
		return custom.deleteUserById(custcode);
	}

}