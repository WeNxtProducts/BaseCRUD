package com.wenxt.crud.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.crud.model.LT_POL_EMPLOYEE;

@Repository
public interface LtPolEmployeeRepository  extends JpaRepository<LT_POL_EMPLOYEE,Long>{

}
