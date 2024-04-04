package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_POL_PLAN_HDR;

@Repository
public interface LtPolPlanHdrRepository extends JpaRepository<LT_POL_PLAN_HDR, Integer> {
	
	

}
