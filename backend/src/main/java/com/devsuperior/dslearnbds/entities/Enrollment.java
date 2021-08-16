package com.devsuperior.dslearnbds.entities;

import java.time.Instant;

import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

public class Enrollment {
	
	private EnrollmentPK id = new EnrollmentPK();
	private Instant enrollMoment;
	private Instant refundMoment;
	private Boolean available;
	private Boolean onlyUpdate;
	
	public Enrollment() {
		
	}

	public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, Boolean available,
			Boolean onlyUpdate) {
		super();
		id.setUser(user);
		id.setOffer(offer);
		this.enrollMoment = enrollMoment;
		this.refundMoment = refundMoment;
		this.available = available;
		this.onlyUpdate = onlyUpdate;
	}

	public User getStudent() {
		return id.getUser();
	}
	
	public void setStudent(User user) {
		id.setUser(user);
	}
	
	public Offer getOffer() {
		return id.getOffer();
	}
	
	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}

	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}

	public Instant getRefundMoment() {
		return refundMoment;
	}

	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Boolean getOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(Boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}
	
		

}
