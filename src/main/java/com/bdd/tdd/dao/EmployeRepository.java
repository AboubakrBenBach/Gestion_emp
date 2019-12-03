package com.bdd.tdd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.tdd.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
