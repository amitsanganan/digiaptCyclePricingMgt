/**
 * 
 */
package com.sanganan.service;

import com.sanganan.dao.SeatDAO;
import com.sanganan.model.Seat;

/**
 * @author Apple
 *
 */
public class SeatService {

	private Long date = null;

	private Seat seat = null;

	private SeatDAO seatDAO = null;

	public SeatService(Long date, Seat seat) {
		this.date = date;
		this.seat = seat;
		seatDAO = new SeatDAO();
	}

	public double getPrice() {
		return seat.getPrice();
	}

	public void calculatePrice() {
		double price = seatDAO.getSeatPrice(seat.getType(), date);
		double totalPrice = price;
		seat.setPrice(totalPrice);
	}

}
