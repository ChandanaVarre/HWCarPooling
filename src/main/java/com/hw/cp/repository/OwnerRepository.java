package com.hw.cp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hw.cp.model.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>{

	@Query("select o from Owner o where o.ownerId not in ("
			+ "select b.owner from Bookings b))")
	public List<Owner> getFreeOwners();
}
