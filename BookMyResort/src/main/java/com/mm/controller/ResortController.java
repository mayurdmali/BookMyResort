package com.mm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mm.entity.Customers;
import com.mm.service.ResortService;

@RestController
@RequestMapping("/api/resort")
public class ResortController {

	@Autowired
	ResortService resortservice;
	
	@PostMapping("/addbooking")
	public String addBooking(@RequestBody Customers customer) {
		
		return resortservice.addBooking(customer);
	}
	@PostMapping("/addallbooking")
	public String addAllBooking(@RequestBody List<Customers> customer) {
		
		return resortservice.addAllBooking(customer);
	}
	@GetMapping("/getbooking")
	public List<Customers> getAllBookings( ) {
		return resortservice.getAllBooking();

	}
	@GetMapping("/byname/{roomtype}")
	public List<Customers> getBookingByRoomType(@PathVariable String roomtype) {
		return resortservice.getBookingByRoomType(roomtype);
	}
	@DeleteMapping("/delete/{c_id}")
	public String deleteBooking(@PathVariable("c_id") int c_id) {
		return resortservice.deleteBooking(c_id);
	}
	@PutMapping("/update")
	public String updateBooking(@RequestBody Customers customer) {
		return resortservice.updateBooking(customer);
	}

	

	

}
