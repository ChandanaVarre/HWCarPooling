package com.hw.cp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class Owner extends AuditModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6879837930712288923L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "owner_id")
	private long ownerId;

	@Column(name = "owner_name")
	private String ownerName;

	@Column(name = "driving_license")
	private String drivingLicenseNo;

	@Column(name = "mobile_no")
	private String mobileNo;
	
	@OneToOne
	@JoinColumn(name = "vehicleId")
	private Vehicle vehile;
	

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getDrivingLicenseNo() {
		return drivingLicenseNo;
	}

	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
