package com.wenxt.crud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.crud.model.LT_CLAIM_COVER_DTLS;

@Repository
public interface LtClaimCoverDtlsRepository extends JpaRepository<LT_CLAIM_COVER_DTLS, Long> {

}
