package thirdtermOOP;

public class Boat extends Vehicle{

private String mainSail;
	
	public Boat(double speed, String color, double price, String mainSail) {
		super(speed, color, price);
		this.mainSail = mainSail;
	}
	
	public void Float() {
		System.out.println("The boat is floating.");
	}
}
