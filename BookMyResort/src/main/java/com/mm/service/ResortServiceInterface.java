package com.mm.service;

import java.util.List;

import com.mm.entity.Customers;

public interface ResortServiceInterface {
	
	public String addBooking(Customers customer);
	
	public String addAllBooking(List<Customers> customer);
	
	public List<Customers> getAllBooking();
	
	public List<Customers> getBookingByRoomType(String roomtype);
	
	public String deleteBooking(int c_id);
	
	public String updateBooking(Customers customer);

	
	
	
	

}
