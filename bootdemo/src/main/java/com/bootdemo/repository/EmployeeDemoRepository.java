package com.bootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootdemo.model.EmployeeDemoModel;

@Repository
public interface EmployeeDemoRepository extends JpaRepository<EmployeeDemoModel, Integer> {

}
