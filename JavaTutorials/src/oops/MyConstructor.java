package oops;
class Vehicle {
	
	int noOfWheels;
	int headLights;
	String color;
	
	Vehicle(int noOfWheels){
		this.noOfWheels=noOfWheels;
		headLights = 2;
	}
	Vehicle(int noOfWheels, String color){
		this.noOfWheels=noOfWheels;
		this.color=color;
		headLights=2;
	}
}
public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Vehicle(4);
		Vehicle scooty = new Vehicle(2);
		
		Vehicle eRickshaw = new Vehicle(3, "Yellow");
		//		car.wheels=4;
		System.out.println(eRickshaw.noOfWheels+" wheels and color = "+eRickshaw.color);
//		System.out.println(car.headLights);
	}

}
