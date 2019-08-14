package com.hw.cp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hw.cp.model.CommuterAddress;

@Repository
public interface CommuterAddressRepository extends JpaRepository<CommuterAddress, Long>{

}
