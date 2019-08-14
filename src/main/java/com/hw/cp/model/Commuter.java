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
@Table(name = "commuter")
public class Commuter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "commuter_id")
	private long commuterId;

	@Column(name = "commuter_name")
	private String commuterName;

	@OneToOne
	@JoinColumn(name = "address_id")
	private CommuterAddress address;

	public long getCommuterId() {
		return commuterId;
	}

	public void setCommuterId(long commuterId) {
		this.commuterId = commuterId;
	}

	public String getCommuterName() {
		return commuterName;
	}

	public void setCommuterName(String commuterName) {
		this.commuterName = commuterName;
	}

	public CommuterAddress getAddress() {
		return address;
	}

	public void setAddress(CommuterAddress address) {
		this.address = address;
	}

}
