package com.hw.cp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hw.cp.model.BookingAddress;


@Repository
public interface BookingAddressRepository extends JpaRepository<BookingAddress, Long>{

}
