/**
 * 
 */
package com.sanganan.dao;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Apple
 *
 */
public class ChainAssemblyDAO {

	private Map<Long, Double> chain_size_ten_price;
	private Map<Long, Double> chain_size_eight_price;
	private Map<Long, Double> chain_size_six_price;

	private Map<Long, Double> chain_speed_ten_price;
	private Map<Long, Double> chain_speed_eight_price;
	private Map<Long, Double> chain_speed_six_price;

	public ChainAssemblyDAO() {
		setChainPrice();
	}

	private void setChainPrice() {
		chain_size_ten_price = new TreeMap<>();
		chain_size_ten_price.put(Long.valueOf(1578240385), 2222.00);
		chain_size_ten_price.put(Long.valueOf(1586102785), 1111.00);

		chain_size_eight_price = new TreeMap<>();
		chain_size_eight_price.put(Long.valueOf(1578240385), 1000.00);
		chain_size_eight_price.put(Long.valueOf(1586102785), 2000.00);

		chain_size_six_price = new TreeMap<>();
		chain_size_six_price.put(Long.valueOf(1578240385), 1000.00);
		chain_size_six_price.put(Long.valueOf(1586102785), 2000.00);

		chain_speed_ten_price = new TreeMap<>();
		chain_speed_ten_price.put(Long.valueOf(1578240385), 1000.00);
		chain_speed_ten_price.put(Long.valueOf(1586102785), 2000.00);

		chain_speed_eight_price = new TreeMap<>();
		chain_speed_eight_price.put(Long.valueOf(1578240385), 1000.00);
		chain_speed_eight_price.put(Long.valueOf(1586102785), 2000.00);

		chain_speed_six_price = new TreeMap<>();
		chain_speed_six_price.put(Long.valueOf(1578240385), 100.00);
		chain_speed_six_price.put(Long.valueOf(1586102785), 200.00);
		chain_speed_six_price.put(Long.valueOf(1586132785), 250.00);

	}

	public Double getChainSizePrice(int part, Long date) {
		Double price = Double.valueOf(0);

		if (part == 10) {

			for (Map.Entry<Long, Double> entry : chain_size_ten_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part == 8) {

			for (Map.Entry<Long, Double> entry : chain_size_eight_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (6 == part) {

			for (Map.Entry<Long, Double> entry : chain_size_six_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		}
		return price;
	}

	public Double getChainSpeedPrice(int part, Long date) {
		Double price = Double.valueOf(0);

		if (part == 10) {

			for (Map.Entry<Long, Double> entry : chain_speed_ten_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part == 8) {

			for (Map.Entry<Long, Double> entry : chain_speed_eight_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (6 == part) {

			for (Map.Entry<Long, Double> entry : chain_speed_six_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		}
		return price;
	}

}
