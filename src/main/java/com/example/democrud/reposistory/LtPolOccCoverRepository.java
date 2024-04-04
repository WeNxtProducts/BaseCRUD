package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_POL_OCC_COVER;


@Repository
public interface LtPolOccCoverRepository extends JpaRepository<LT_POL_OCC_COVER, Long> {

}
