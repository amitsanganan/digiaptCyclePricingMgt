/**
 * 
 */
package com.sanganan.dao;

import java.util.Map;
import java.util.TreeMap;

import com.sanganan.enums.Rim;
import com.sanganan.enums.Spoke;
import com.sanganan.enums.Tube;
import com.sanganan.enums.Tyre;

/**
 * @author Apple
 *
 */
public class WheelDAO {

	private Map<Long, Double> rim_steel_price;
	private Map<Long, Double> rim_alloy_price;
	private Map<Long, Double> rim_chrome_price;

	private Map<Long, Double> tangentlacing_spoke_price;
	private Map<Long, Double> wheelbuilding_spoke_price;

	private Map<Long, Double> tube_tube_price;
	private Map<Long, Double> tubeless_tube_price;

	private Map<Long, Double> clincher_tyre_price;
	private Map<Long, Double> tubular_tyre_price;

	public WheelDAO() {
		setRimPrice();
		setSpokePrice();
		setTubePrice();
		setTyrePrice();
	}

	private void setTyrePrice() {
		clincher_tyre_price = new TreeMap<>();
		clincher_tyre_price.put(Long.valueOf(1578240385), 2000.00);
		clincher_tyre_price.put(Long.valueOf(1586102785), 1500.00);

		tubular_tyre_price = new TreeMap<>();
		tubular_tyre_price.put(Long.valueOf(1578240385), 1000.00);
		tubular_tyre_price.put(Long.valueOf(1586102785), 2000.00);

	}

	private void setTubePrice() {

		tube_tube_price = new TreeMap<>();
		tube_tube_price.put(Long.valueOf(1578240385), 2000.00);
		tube_tube_price.put(Long.valueOf(1586102785), 1500.00);

		tubeless_tube_price = new TreeMap<>();
		tubeless_tube_price.put(Long.valueOf(1578240385), 1000.00);
		tubeless_tube_price.put(Long.valueOf(1586102785), 2000.00);

	}

	private void setSpokePrice() {
		tangentlacing_spoke_price = new TreeMap<>();
		tangentlacing_spoke_price.put(Long.valueOf(1578240385), 2000.00);
		tangentlacing_spoke_price.put(Long.valueOf(1586102785), 1500.00);

		wheelbuilding_spoke_price = new TreeMap<>();
		wheelbuilding_spoke_price.put(Long.valueOf(1578240385), 1000.00);
		wheelbuilding_spoke_price.put(Long.valueOf(1586102785), 2000.00);

	}

	private void setRimPrice() {

		rim_steel_price = new TreeMap<>();
		rim_steel_price.put(Long.valueOf(1578240385), 2000.00);
		rim_steel_price.put(Long.valueOf(1586102785), 1500.00);

		rim_alloy_price = new TreeMap<>();
		rim_alloy_price.put(Long.valueOf(1578240385), 1000.00);
		rim_alloy_price.put(Long.valueOf(1586102785), 2000.00);

		rim_chrome_price = new TreeMap<>();
		rim_chrome_price.put(Long.valueOf(1578240385), 3000.00);
		rim_chrome_price.put(Long.valueOf(1586102785), 4000.00);

	}

	public Double getRimPrice(String part, Long date) {
		Double price = Double.valueOf(0);

		if (part.equalsIgnoreCase(Rim.ALLOY.toString())) {

			for (Map.Entry<Long, Double> entry : rim_alloy_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(Rim.CHROME.toString())) {

			for (Map.Entry<Long, Double> entry : rim_chrome_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(Rim.STEEL.toString())) {

			for (Map.Entry<Long, Double> entry : rim_steel_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		}
		return price;
	}

	public Double getSpokePrice(String spoke, Long date) {
		Double price = Double.valueOf(0);
		if (spoke.equalsIgnoreCase(Spoke.TANGENTIALLACING.toString())) {
			for (Map.Entry<Long, Double> entry : tangentlacing_spoke_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (spoke.equalsIgnoreCase(Spoke.WHEELBUILDING.toString())) {
			for (Map.Entry<Long, Double> entry : wheelbuilding_spoke_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}

		}
		return price;
	}

	public Double getTubePrice(String parts, Long date) {
		Double price = Double.valueOf(0);
		if (parts.equalsIgnoreCase(Tube.TUBE.toString())) {
			for (Map.Entry<Long, Double> entry : tube_tube_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (parts.equalsIgnoreCase(Tube.TUBELESS.toString())) {
			for (Map.Entry<Long, Double> entry : tubeless_tube_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}

		}
		return price;
	}

	public Double getTyrePrice(String parts, Long date) {
		Double price = Double.valueOf(0);
		if (parts.equalsIgnoreCase(Tyre.CLINCHER.toString())) {
			for (Map.Entry<Long, Double> entry : clincher_tyre_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (parts.equalsIgnoreCase(Tyre.TUBULAR.toString())) {
			for (Map.Entry<Long, Double> entry : tubular_tyre_price.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}

		}
		return price;
	}

}
