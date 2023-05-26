package thirdtermOOP;

public class Main {

	public static void main(String[] args) {
		ToyotaVIOS car = new ToyotaVIOS (120, "Black", 20000, "Radial");
		U2spyPlane plane = new U2spyPlane (1000, "White", 100000, 80);
		FandangoYacht boat = new FandangoYacht (30, "Blue", 3000000, "Blue");

		car.Drive();
		car.stop();
		
		System.out.println("-----------------------------");
		
		plane.Fly();
		plane.stop();
		
		System.out.println("-----------------------------");
		
		boat.Float();
		boat.stop();
	}

}
