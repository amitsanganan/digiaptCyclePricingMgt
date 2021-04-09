/**
 * 
 */
package com.sanganan.dao;

import java.util.Map;
import java.util.TreeMap;

import com.sanganan.enums.HandleType;

/**
 * @author Apple
 *
 */
public class HandleDAO {

	private Map<Long, Double> handle_ordinary_price;
	private Map<Long, Double> handle_drop_price;
	private Map<Long, Double> handle_randonneur_price;

	private Map<Long, Double> handle_standard_price;
	private Map<Long, Double> handle_track_price;
	
	private Map<Long, Double> handle_shocklock_price;


	public HandleDAO() {
		setFramePrice();
	}

	private void setFramePrice() {
		handle_ordinary_price = new TreeMap<>();
		handle_ordinary_price.put(Long.valueOf(1578240385), 2222.00);
		handle_ordinary_price.put(Long.valueOf(1586102785), 1111.00);

		handle_drop_price = new TreeMap<>();
		handle_drop_price.put(Long.valueOf(1578240385), 1000.00);
		handle_drop_price.put(Long.valueOf(1586102785), 2000.00);

		handle_randonneur_price = new TreeMap<>();
		handle_randonneur_price.put(Long.valueOf(1578240385), 1000.00);
		handle_randonneur_price.put(Long.valueOf(1586102785), 2000.00);

		handle_standard_price = new TreeMap<>();
		handle_standard_price.put(Long.valueOf(1578240385), 1000.00);
		handle_standard_price.put(Long.valueOf(1586102785), 2000.00);

		handle_track_price = new TreeMap<>();
		handle_track_price.put(Long.valueOf(1578240385), 1000.00);
		handle_track_price.put(Long.valueOf(1586102785), 2000.00);
		
		handle_shocklock_price = new TreeMap<>();
		handle_shocklock_price.put(Long.valueOf(1578240385), 100.00);
		handle_shocklock_price.put(Long.valueOf(1586102785), 200.00);
		handle_shocklock_price.put(Long.valueOf(1586132785), 250.00);


	}

	public Double getHandlePrice(String part, Long date) {
		Double price = Double.valueOf(0);

		if (part.equalsIgnoreCase(HandleType.ORDINARY.toString())) {

			for (Map.Entry<Long, Double> entry : handle_ordinary_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(HandleType.DROP.toString())) {

			for (Map.Entry<Long, Double> entry : handle_drop_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(HandleType.RANDONNEUR.toString())) {

			for (Map.Entry<Long, Double> entry : handle_randonneur_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(HandleType.STANDARD.toString())) {

			for (Map.Entry<Long, Double> entry : handle_standard_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(HandleType.TRACK.toString())) {

			for (Map.Entry<Long, Double> entry : handle_track_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} 
		return price;
	}
	
	
	public Double getShocklockPrice(Boolean isPart, Long date) {
		Double price = Double.valueOf(0);
		if (isPart) {
			for (Map.Entry<Long, Double> entry : handle_shocklock_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} 
		return price;
	}

}
