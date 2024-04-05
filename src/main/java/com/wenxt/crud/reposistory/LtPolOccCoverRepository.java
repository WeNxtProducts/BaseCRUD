package com.wenxt.crud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.crud.model.LT_POL_OCC_COVER;


@Repository
public interface LtPolOccCoverRepository extends JpaRepository<LT_POL_OCC_COVER, Long> {

}
