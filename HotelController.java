package com.vtech.Feb28;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

	@Autowired
	HotelService hotelService;

	@GetMapping("/hotels")
	public List<Hotel> getHotels()
	{
		return  hotelService.get();
	}
	@GetMapping("/hotel/{id}")
	public Hotel getHotel(@PathVariable int id)
	{
		return  hotelService.getById(id);
	}
	@PostMapping("/hotel")
	public String addHotel(@RequestBody Hotel h)
	{
		return hotelService.addHotel(h);
	}
}
