package com.example.democrud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.LT_POL_EMPLOYEE;

@Repository
public interface LtPolEmployeeRepository  extends JpaRepository<LT_POL_EMPLOYEE,Long>{

}