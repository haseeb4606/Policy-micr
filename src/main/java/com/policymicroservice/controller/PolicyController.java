package com.policymicroservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.policymicroservice.dtos.PolicyDto;
import com.policymicroservice.services.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void savePolicy(@Valid @RequestBody PolicyDto dto) {
		policyService.createPolicy(dto);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public PolicyDto findById(@RequestParam Integer id) {
		return policyService.findById(id);
	}
}
