package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_POL_EMP_COVER;

@Repository
public interface LtPolEmpCoverRepository extends JpaRepository<LT_POL_EMP_COVER, Long> {

}
