package com.mm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "Bookinginfo", schema = "books")
public class Customers {
	@Id
	// if c_id in table not found then generate automatically in db
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int c_id;
	private String name;
	private int noofpeople;
	private String roomtype;
	private String checkin;
	private String checkout;

	public Customers() {
		super();
	}

	public Customers(String name, int noofpeople, String roomtype, String checkin, String checkout) {
		super();
		this.name = name;
		this.noofpeople = noofpeople;
		this.roomtype = roomtype;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoofpeople() {
		return noofpeople;
	}

	public void setNoofpeople(int noofpeople) {
		this.noofpeople = noofpeople;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		return "Customers [c_id=" + c_id + ", name=" + name + ", noofpeople=" + noofpeople + ", roomtype=" + roomtype
				+ ", checkin=" + checkin + ", checkout=" + checkout + "]";
	}

}
