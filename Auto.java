package Assignment;

public class Auto extends Vehicle {
	private void auto() {
		System.out.println("It's Auto");
		
	}
	public static void main(String[] args) {
		Auto vech = new Auto();
		vech.auto();
		vech.brake();
		vech.horn();
	}
	

}
