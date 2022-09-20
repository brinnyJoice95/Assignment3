package Assignment;

public class Car extends Vehicle {
	public void newCar() {
		System.out.println("Its new car");

	}
	public static void main(String[] args) {
		
	
		Car obj= new Car();
		obj.newCar();
		obj.horn();
		obj.brake();
	
		
	}

}
