package com.springboot.second.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.second.app.model.EmployeeBean;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeBean, Long> {

}
