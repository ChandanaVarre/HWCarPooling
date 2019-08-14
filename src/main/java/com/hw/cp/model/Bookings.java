package com.hw.cp.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Bookings extends AuditModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1456205557658415506L;

	@Id
	@Column(name = "booking_id")
	private long bookingId;

	@OneToOne
	@JoinColumn(name = "start_location")
	private BookingAddress startlocation;

	@OneToOne
	@JoinColumn(name = "end_location")
	private BookingAddress endLocation;

	@Column(name = "ride_start_time")
	private LocalDateTime rideStartTime;

	@Column(name = "estimated_end_time")
	private LocalDateTime estimatedEndTime;

	@Column(name = "distace")
	private float distance; // distance b/w start and end location in km

	@OneToMany
	@JoinColumn(name = "commuter_id")
	private List<Commuter> commuters;

	@OneToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public BookingAddress getStartlocation() {
		return startlocation;
	}

	public void setStartlocation(BookingAddress startlocation) {
		this.startlocation = startlocation;
	}

	public BookingAddress getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(BookingAddress endLocation) {
		this.endLocation = endLocation;
	}

	public LocalDateTime getRideStartTime() {
		return rideStartTime;
	}

	public void setRideStartTime(LocalDateTime rideStartTime) {
		this.rideStartTime = rideStartTime;
	}

	public LocalDateTime getEstimatedEndTime() {
		return estimatedEndTime;
	}

	public void setEstimatedEndTime(LocalDateTime estimatedEndTime) {
		this.estimatedEndTime = estimatedEndTime;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public List<Commuter> getCommuters() {
		return commuters;
	}

	public void setCommuters(List<Commuter> commuters) {
		this.commuters = commuters;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
