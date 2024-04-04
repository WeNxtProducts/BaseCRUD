package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_POL_ASSRD_DET;

@Repository
public interface LtPlAssrdDetReposistory extends JpaRepository<LT_POL_ASSRD_DET, Long> {

}