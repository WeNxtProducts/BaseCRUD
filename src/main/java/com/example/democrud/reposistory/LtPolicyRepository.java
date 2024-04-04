package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_POLICY;

@Repository
public interface LtPolicyRepository extends JpaRepository<LT_POLICY, Long> {

}
