/**
 * 
 */
package com.sanganan.dao;

import java.util.Map;
import java.util.TreeMap;

import com.sanganan.enums.SeatType;

/**
 * @author Nijesh
 *
 */
public class SeatDAO {

	private Map<Long, Double> seat_comfort_price;
	private Map<Long, Double> seat_ordinary_price;
	private Map<Long, Double> seat_racing_price;

	public SeatDAO() {
		setSeatPrice();
	}

	private void setSeatPrice() {
		seat_comfort_price = new TreeMap<>();
		seat_comfort_price.put(Long.valueOf(1578240385), 2000.00);
		seat_comfort_price.put(Long.valueOf(1586102785), 1500.00);

		seat_ordinary_price = new TreeMap<>();
		seat_ordinary_price.put(Long.valueOf(1578240385), 1000.00);
		seat_ordinary_price.put(Long.valueOf(1586102785), 2000.00);

		seat_racing_price = new TreeMap<>();
		seat_racing_price.put(Long.valueOf(1578240385), 1000.00);
		seat_racing_price.put(Long.valueOf(1586102785), 2000.00);

	}

	public Double getSeatPrice(String part, Long date) {
		Double price = Double.valueOf(0);

		if (part.equalsIgnoreCase(SeatType.ORDINARY.toString())) {

			for (Map.Entry<Long, Double> entry : seat_comfort_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(SeatType.COMFORT.toString())) {

			for (Map.Entry<Long, Double> entry : seat_ordinary_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(SeatType.RACING.toString())) {

			for (Map.Entry<Long, Double> entry : seat_racing_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		}
		return price;
	}

}
