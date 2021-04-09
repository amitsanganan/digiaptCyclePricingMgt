/**
 * 
 */
package com.sanganan.core;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.sanganan.model.Bicycle;
import com.sanganan.util.PriceEngineUtil;

/**
 * @author Apple
 *
 */
public class PricingEngine {

	private JSONArray enquiry;

	public PricingEngine(JSONArray enquiry) {
		this.enquiry = enquiry;
	}

	public void calculatePrice() {

		ExecutorService service = Executors.newFixedThreadPool(10);

		
		try {
		
		for (int i = 0; i < enquiry.length(); i++) {

			try {
				JSONObject jsonObj = enquiry.getJSONObject(i);
				ObjectMapper mapper = new ObjectMapper();

				try {
					Bicycle b = mapper.readValue(jsonObj.toString(), Bicycle.class);

					Future<Bicycle> output = service.submit(new PriceCalculator(b));
					Bicycle bicycleOutput = output.get();
					
					System.out.println( bicycleOutput.getOrder()+" "+ bicycleOutput.getPrice());


				} catch (IOException | InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}


			} catch (JSONException e) {
				e.printStackTrace();
			}
			
				
			
		}}catch (Exception e) {
			e.printStackTrace();
		}
		
		service.shutdown();

	}

}
