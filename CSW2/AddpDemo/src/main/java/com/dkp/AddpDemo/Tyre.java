package com.dkp.AddpDemo;

public class Tyre 
{
	private String brand;
	private String thickness;
	

	public Tyre(String thickness) {
		super();
		this.thickness = thickness;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", "+thickness+"]";
	}
	

}
