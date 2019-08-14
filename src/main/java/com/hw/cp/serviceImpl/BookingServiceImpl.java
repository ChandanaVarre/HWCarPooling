package com.hw.cp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hw.cp.dto.BookingRequest;
import com.hw.cp.model.BookingAddress;
import com.hw.cp.model.Bookings;
import com.hw.cp.model.Owner;
import com.hw.cp.model.Vehicle;
import com.hw.cp.repository.BookingAddressRepository;
import com.hw.cp.repository.BookingsRepository;
import com.hw.cp.repository.OwnerRepository;
import com.hw.cp.repository.VehicleRepository;
import com.hw.cp.service.BookingService;

public class BookingServiceImpl implements BookingService{
	
	@Autowired
	BookingAddressRepository bookigAddressRepository;
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Autowired
	BookingsRepository bookRepository;
	
	@Autowired
	OwnerRepository ownerRepository;
	

	@Override
	public long bookRide(BookingRequest request) {
		Bookings booking = new Bookings();
		BookingAddress startAddress = new BookingAddress();
		
		String startLocation = request.getStartLocation();
		String[] sloation = startLocation.split(",");
		startAddress.setAddressLine1(sloation[0]);
		startAddress.setAddressLine2(sloation[1]);
		startAddress.setCity(sloation[2]);
		startAddress.setCountry(sloation[3]);
		startAddress.setState(sloation[4]);
		startAddress.setZipCode(sloation[5]);
		
		 BookingAddress sl = bookigAddressRepository.save(startAddress);
		 
		 BookingAddress endtAddress = new BookingAddress();
			
			String endLocation = request.getStartLocation();
			String[] eloation = endLocation.split(",");
			endtAddress.setAddressLine1(eloation[0]);
			endtAddress.setAddressLine2(eloation[1]);
			endtAddress.setCity(eloation[2]);
			endtAddress.setCountry(eloation[3]);
			endtAddress.setState(eloation[4]);
			endtAddress.setZipCode(eloation[5]);
			
			 BookingAddress el = bookigAddressRepository.save(endtAddress);
		 
			List<Vehicle> vehicles = vehicleRepository.getFreeVehicle();
			List<Owner> owners = ownerRepository.getFreeOwners();
		//address.
		booking.setStartlocation(sl);
		booking.setEndLocation(el);
		booking.setDistance(10);
		booking.setEstimatedEndTime(request.getRideStartTime().plusHours(1));
		booking.setRideStartTime(request.getRideStartTime());
		booking.setOwner(owners.get(0));
		return bookRepository.save(booking).getBookingId();
	}

	@Override
	public long cancleRide(long bookingId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
