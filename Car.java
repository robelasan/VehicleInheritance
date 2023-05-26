package thirdtermOOP;

public class Car extends Vehicle{

	private String tireType;
	
	public Car(double speed, String color, double price, String tireType) {
		super(speed, color, price);
		this.tireType = tireType;
	}
	
	public void Drive() {
		System.out.println("The car is being driven");
	}
}