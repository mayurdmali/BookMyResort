package com.mm.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mm.entity.Customers;

@Repository
public class ResortDao implements ResortDaoInterface{
	
	@Autowired
	SessionFactory sessionfactory;
	
	

	@Override
	public String addBooking(Customers customer) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(customer);
		tx.commit();
		session.close();
		
		return "Data Added Successfully";
	}

	@Override
	public String addAllBooking(List<Customers> customer) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		for (Customers c : customer) {
			session.save(c);
		}
		tx.commit();
		session.close();
		return "Multiple Data Added Successfully";
	}

	@Override
	public List<Customers> getAllBooking() {
		Session session = sessionfactory.openSession();
		List<Customers> customer = session.createCriteria(Customers.class).list();
		return customer;
	}

	@Override
	public List<Customers> getBookingByRoomType(String roomtype) {
		Session session = sessionfactory.openSession();
		List<Customers> customer = session.createCriteria(Customers.class).add(Restrictions.like("roomtype", "%" + roomtype + "%"))
				.list();
		session.close();
		
		return customer;
	}

	@Override
	public String deleteBooking(int c_id) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		Customers customers = session.get(Customers.class, c_id);
		session.delete(customers);
		tx.commit();
		session.close();
		
		return "Data Deleted";
	}

	@Override
	public String updateBooking(Customers customer) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(customer); // direct updating the customer
		tx.commit();
		session.close();
		
		return "Data Updated Successfully";
	}
	
	
	
	

}
