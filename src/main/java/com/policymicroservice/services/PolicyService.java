package com.policymicroservice.services;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policymicroservice.dtos.PolicyDto;
import com.policymicroservice.entities.PolicyEntity;
import com.policymicroservice.repositories.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	public void createPolicy(PolicyDto dto) {
		PolicyEntity pe = new PolicyEntity();
		pe.setPolNumber(dto.getPolNumber());
		pe.setType(dto.getType());
		pe.setStartDate(dto.getStartDate());
		pe.setEndDate(dto.getEndDate());
		pe.setIsActive(dto.getIsActive());

		Random random = new Random();
		pe.setUuid(random.toString());

		policyRepository.save(pe);

	}

	public PolicyDto findById(Integer id) {
		Optional<PolicyEntity> pe = policyRepository.findById(id);
		return convert(pe.get());
	}

	public PolicyDto convert(PolicyEntity pol) {
		PolicyDto dto = null;
		if (pol != null) {
			dto = new PolicyDto();
			dto.setId(pol.getId());
			dto.setPolNumber(pol.getPolNumber());
			dto.setType(pol.getType());
			dto.setStartDate(pol.getStartDate());
			dto.setEndDate(pol.getEndDate());
			dto.setIsActive(pol.getIsActive());

		}

		return dto;
	}

}
