package com.policymicroservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.policymicroservice.entities.PolicyEntity;

@Repository
public interface PolicyRepository extends CrudRepository<PolicyEntity, Integer> {
	public PolicyEntity findBypolNum(String polNum);

}
