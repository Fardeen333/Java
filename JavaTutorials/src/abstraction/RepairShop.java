package abstraction;

public class RepairShop {
	
//	public static void repairCar(Wagnor Car) {
//		System.out.println("Car is repaired");
//	}
//	
//	public static void repairCar(Audi Car) {
//		System.out.println("Car is repaired");
//	}
	public static void repairCar(Car car) {
		System.out.println("Car is repaired");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wagnor wagnor = new Wagnor();
		Audi audi = new Audi();

		repairCar(wagnor);
		repairCar(audi);
	}

}
