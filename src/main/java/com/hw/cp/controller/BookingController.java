package com.hw.cp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hw.cp.dto.BookingRequest;
import com.hw.cp.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingService;

	public ResponseEntity<?> bookRide(@RequestBody @Valid BookingRequest bookingRequest){
		return null; // need to write
	}
}
