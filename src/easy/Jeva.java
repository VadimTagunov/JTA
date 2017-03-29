package easy;

public class Jeva {
	private String model; 
	private int speed; 
	private boolean brake;
	
	public Jeva(String model, int speed) {
		this.model = model;
		this.speed = speed;
		
		if (speed > 0) {
			this.brake = false;
		}
		else {
			this.brake = true;
		}
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("Now my speed's about " + speed + " kmh.");
		if (speed > 0) {
			brake = false;
		}
	}
	
	public void nameYourself() {
		System.out.println("My model is " + this.model + "."); 
	}
	
	public void brakeOrNot() {
		if (brake == true) {
			System.out.println("Yep, my brake's ON.");
		}
		else {
			System.out.println("Nope, my brake's OFF.");
		}
	}
	
	void performCalculation() {
		System.out.println(0);
	}
	
	void performCalculation(int a) {
		System.out.println(a);
	}
	
	void performCalculation(int a, int b) {
		System.out.println(a + b);
	}
	
	int performCalculation(int a, int b, int lol) {
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}
}
