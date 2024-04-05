package com.wenxt.crud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.crud.model.LT_POL_PLAN_HDR;

@Repository
public interface LtPolPlanHdrRepository extends JpaRepository<LT_POL_PLAN_HDR, Integer> {
	
	

}
