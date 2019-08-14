package com.hw.cp.service;
import org.springframework.stereotype.Service;

import com.hw.cp.dto.BookingRequest;

@Service
public interface BookingService {

	long bookRide(BookingRequest request);
	
	long cancleRide(long bookingId);

} 
