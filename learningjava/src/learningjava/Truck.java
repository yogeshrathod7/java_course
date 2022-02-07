package learningjava;

public class Truck extends commonVehicle {

	public static void main(String[] args) {
		commonVehicle cv = new commonVehicle();
		System.out.println("Truck Performance");
		Truck tk = new Truck();
		tk.Start();
		tk.Start();
		tk.loadCapacity();

		// TODO Auto-generated method stub

	}

	public void loadCapacity() {

		System.out.println("Load Capcity");
	}

}
