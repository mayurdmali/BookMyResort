package com.mm.dao;

import java.util.List;

import com.mm.entity.Customers;

public interface ResortDaoInterface {
	
	public String addBooking(Customers customer);
	
	String addAllBooking(List<Customers> customer);
	
	public List<Customers> getAllBooking();
	
	public List<Customers> getBookingByRoomType(String roomtype);
	
	public String deleteBooking(int c_id);
	
	public String updateBooking(Customers customer);

	
	

}
