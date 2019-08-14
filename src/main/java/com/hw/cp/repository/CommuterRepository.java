package com.hw.cp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hw.cp.model.Commuter;

@Repository
public interface CommuterRepository extends JpaRepository<Commuter, Long>{

}
