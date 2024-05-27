package com.vtech.Feb28;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Hotel {

	@Id
	private int hotelId;
	private String hotelName;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + "]";
	}
	public Hotel() {
		super();
	}
	public Hotel(int hotelId, String hotelName) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
}
