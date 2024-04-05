package com.wenxt.crud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.crud.model.LT_POLICY;

@Repository
public interface LtPolicyRepository extends JpaRepository<LT_POLICY, Long> {

}
