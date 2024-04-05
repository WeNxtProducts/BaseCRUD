package com.wenxt.crud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.crud.model.LT_CLAIM_ESTIMATE;

@Repository
public interface LtClaimEstimateRepository extends JpaRepository<LT_CLAIM_ESTIMATE, Long> {

}
