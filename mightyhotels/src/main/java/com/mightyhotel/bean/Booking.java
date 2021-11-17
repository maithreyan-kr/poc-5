package com.mightyhotel.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Booking {
	@Id
		private String username;
		private String Roomnumber,Noofmemberstostay, checkin,checkout;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getRoomnumber() {
			return Roomnumber;
		}
		public void setRoomnumber(String roomnumber) {
			Roomnumber = roomnumber;
		}
		public String getNoofmemberstostay() {
			return Noofmemberstostay;
		}
		public void setNoofmemberstostay(String noofmemberstostay) {
			Noofmemberstostay = noofmemberstostay;
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

	
	}


