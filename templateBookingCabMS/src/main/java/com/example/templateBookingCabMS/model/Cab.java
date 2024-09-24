package com.example.templateBookingCabMS.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Cab {

	private Integer cabId;
	@JsonProperty("fromLocation")
	private String fromLocation;
	
	@JsonProperty("toLocation")
	private String toLocation;
	
	@JsonProperty("typeofCab")
	private Integer typeofCab;
	
	private Double rate;
	public Integer getCabId() {
		return cabId;
	}
	public void setCabId(Integer cabId) {
		this.cabId = cabId;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public Integer getTypeofCab() {
		return typeofCab;
	}
	public void setTypeofCab(Integer typeofCab) {
		this.typeofCab = typeofCab;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", typeofCab="
				+ typeofCab + ", rate=" + rate + "]";
	}
	/**
	 * @param cabId
	 * @param fromLocation
	 * @param toLocation
	 * @param typeofCab
	 * @param rate
	 */
	public Cab(Integer cabId, String fromLocation, String toLocation, Integer typeofCab, Double rate) {
		this.cabId = cabId;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.typeofCab = typeofCab;
		this.rate = rate;
	}
	/**
	 * 
	 */
	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
