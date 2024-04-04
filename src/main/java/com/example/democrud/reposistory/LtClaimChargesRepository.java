package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_CLAIM_CHARGES;

@Repository
public interface LtClaimChargesRepository extends JpaRepository<LT_CLAIM_CHARGES, Long> {

}
