/**
 * 
 */
package com.sanganan.model;

/**
 * @author Apple
 *
 */
public class Bicycle {
	
	private int order;
	
	private String date;

	private Frame frame;

	private Handle handle;

	private Seat seat;

	private Wheel wheel;
	
	private Double price;

	private ChainAssembly chainAssembly;

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public Handle getHandle() {
		return handle;
	}

	public void setHandle(Handle handle) {
		this.handle = handle;
	}



	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

  



	public ChainAssembly getChainAssembly() {
		return chainAssembly;
	}

	public void setChainAssembly(ChainAssembly chainAssembly) {
		this.chainAssembly = chainAssembly;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void calculatePrice() {
		
	price = Double.valueOf(0);
		
		if(null!=this.wheel) {
			price = price + wheel.getPrice();
		}
		if(null!=this.frame) {
			price = price + frame.getPrice();
		}
		if(null!=this.handle) {
			price = price + handle.getPrice();
		}
		if(null!=this.seat) {
			price = price + seat.getPrice();
		}
		if(null!=this.chainAssembly) {
			price = price + chainAssembly.getPrice();
		}
		setPrice(price);
	}
	
	

}
