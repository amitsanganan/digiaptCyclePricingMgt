/**
 * 
 */
package com.sanganan.ui;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.json.JSONArray;
import org.json.JSONException;

import com.sanganan.core.PricingEngine;
import com.sanganan.util.PriceEngineUtil;

/**
 * @author Apple
 *
 */
public class EntryPoint {

	private static JSONArray enquiry = null;

	private static String readInput(String filePath) {
		StringBuilder contentBuilder = new StringBuilder();

		try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
			stream.forEach(s -> contentBuilder.append(s).append("\n"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return contentBuilder.toString();
	}

	public static void main(String[] args) {
		String thisPath = PriceEngineUtil.filePath + "bicycle.json";

		String result = readInput(thisPath);

		try {

			enquiry = new JSONArray(result);
			System.out.println(enquiry.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}

		PricingEngine priceEngine = new PricingEngine(enquiry);
		priceEngine.calculatePrice();

	}

}
