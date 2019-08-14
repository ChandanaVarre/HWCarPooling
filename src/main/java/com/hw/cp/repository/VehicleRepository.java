package com.hw.cp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hw.cp.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

	@Query("select v from Vehicle v where v.vehicleId not in "
			+ "(select o.vehile from Owner o where o.ownerId not in ("
			+ "select b.owner from Bookings b))")
	public List<Vehicle> getFreeVehicle();
	
}
