package thirdtermOOP;

public class Vehicle {
	
	private double speed;
	private String color;
	private double price;
	
	public Vehicle (double speed, String color, double price) {
		this.speed = speed;
		this.color = color;
		this.price = price;
	}
	
	public void stop() {	
		System.out.println("Vehicle stopped.");
	}

}
