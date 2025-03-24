package com.mm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.dao.ResortDao;
import com.mm.entity.Customers;
@Service
public class ResortService implements ResortServiceInterface {
	
	@Autowired
	ResortDao resortdao;

	@Override
	public String addBooking(Customers customer) {
		String addBooking = resortdao.addBooking(customer);
		return addBooking;
	}

	@Override
	public String addAllBooking(List<Customers> customer) {
		
		return resortdao.addAllBooking(customer);
	}

	@Override
	public List<Customers> getAllBooking() {
		return resortdao.getAllBooking();
	}

	@Override
	public List<Customers> getBookingByRoomType(String roomtype) {
		return resortdao.getBookingByRoomType(roomtype);
	}

	@Override
	public String deleteBooking(int c_id) {
		return resortdao.deleteBooking(c_id);
	}

	@Override
	public String updateBooking(Customers customer) {
		return resortdao.updateBooking(customer);
	}

	

}
