package com.vtech.Feb28;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
	
	@Autowired
	HotelRepository hotelRepository;

	public List<Hotel> get() {
		
		return (List<Hotel>) hotelRepository.findAll();
	}
	
	public Hotel getById(int id)
	{
		return hotelRepository.findById(id).get();
	}

	public  String addHotel(Hotel h) {
		// TODO Auto-generated method stub
		
		hotelRepository.save(h);
		return "Saved..";
		
	}

}
