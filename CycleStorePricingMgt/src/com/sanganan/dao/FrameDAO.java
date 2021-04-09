/**
 * 
 */
package com.sanganan.dao;

import java.util.Map;
import java.util.TreeMap;

import com.sanganan.enums.FrameType;

/**
 * @author Apple
 *
 */
public class FrameDAO {

	private Map<Long, Double> frame_ordinary_price;
	private Map<Long, Double> frame_cantilever_price;
	private Map<Long, Double> frame_diamond_price;

	private Map<Long, Double> frame_recumbent_price;
	private Map<Long, Double> frame_prone_price;

	private Map<Long, Double> frame_stepthrough_price;

	public FrameDAO() {
		setFramePrice();
	}

	private void setFramePrice() {
		frame_ordinary_price = new TreeMap<>();
		frame_ordinary_price.put(Long.valueOf(1578240385), 2000.00);
		frame_ordinary_price.put(Long.valueOf(1586102785), 1500.00);

		frame_cantilever_price = new TreeMap<>();
		frame_cantilever_price.put(Long.valueOf(1578240385), 1000.00);
		frame_cantilever_price.put(Long.valueOf(1586102785), 2000.00);

		frame_diamond_price = new TreeMap<>();
		frame_diamond_price.put(Long.valueOf(1578240385), 1000.00);
		frame_diamond_price.put(Long.valueOf(1586102785), 2000.00);

		frame_recumbent_price = new TreeMap<>();
		frame_recumbent_price.put(Long.valueOf(1578240385), 1000.00);
		frame_recumbent_price.put(Long.valueOf(1586102785), 2000.00);

		frame_prone_price = new TreeMap<>();
		frame_prone_price.put(Long.valueOf(1578240385), 1000.00);
		frame_prone_price.put(Long.valueOf(1586102785), 2000.00);

		frame_stepthrough_price = new TreeMap<>();
		frame_stepthrough_price.put(Long.valueOf(1578240385), 1000.00);
		frame_stepthrough_price.put(Long.valueOf(1586102785), 2000.00);

	}

	public Double getFramePrice(String part, Long date) {
		Double price = Double.valueOf(0);

		if (part.equalsIgnoreCase(FrameType.ORDINARY.toString())) {

			for (Map.Entry<Long, Double> entry : frame_ordinary_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(FrameType.CANTILEVER.toString())) {

			for (Map.Entry<Long, Double> entry : frame_cantilever_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(FrameType.DIAMOND.toString())) {

			for (Map.Entry<Long, Double> entry : frame_diamond_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(FrameType.RECUMBENT.toString())) {

			for (Map.Entry<Long, Double> entry : frame_recumbent_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(FrameType.PRONE.toString())) {

			for (Map.Entry<Long, Double> entry : frame_prone_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(FrameType.STEPTHROUGH.toString())) {

			for (Map.Entry<Long, Double> entry : frame_stepthrough_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		}
		return price;
	}

}
