package com.hw.cp.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import io.micrometer.core.lang.NonNull;

public class BookingRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5663493876981328964L;

	@NonNull
	@NotBlank
	private String startLocation;

	@NonNull
	@NotBlank
	private String endLocation;

	@NonNull
	@NotBlank
	private LocalDateTime rideStartTime;

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public LocalDateTime getRideStartTime() {
		return rideStartTime;
	}

	public void setRideStartTime(LocalDateTime rideStartTime) {
		this.rideStartTime = rideStartTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
