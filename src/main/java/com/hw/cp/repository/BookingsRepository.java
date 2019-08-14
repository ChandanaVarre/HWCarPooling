package com.hw.cp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hw.cp.model.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Long>{

}
