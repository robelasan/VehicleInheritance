package thirdtermOOP;

public class Plane extends Vehicle{
	
	private double wingSpan;
	
		public Plane (double speed, String color, double price, double wingSpan) {
			super(speed, color, price);
			this.wingSpan = wingSpan;
		}
	
		public void Fly() {
			System.out.println("The plane is flying.");
		}
	
	}