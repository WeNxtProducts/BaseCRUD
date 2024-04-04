package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_POL_MED_EXAM_DTL;

@Repository
public interface LtPolMedExamDtlRepository extends JpaRepository<LT_POL_MED_EXAM_DTL, Long> {

}
