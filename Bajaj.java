package Assignment;

public class Bajaj extends Vehicle {
	private void bajaj() {
		// TODO Auto-generated method stub
        System.out.println("it's Bajaj");
	}
	public static void main(String[] args) {
		Bajaj baj = new Bajaj();
		baj.bajaj();
		baj.brake();
		baj.horn();
	}
}
