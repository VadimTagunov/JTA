package ConsoleCalc;

import java.util.*;

public class ConsoleCalc {
	private float operandA;
	private float operandB;
	
	public ConsoleCalc() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Now we're going to fill up all our operands. First, enter A operand, and then made it one more time for B:");
		
		operandA = sc.nextFloat();
		operandB = sc.nextFloat();
		sc.close();
		
		System.out.println("Great, now your A operand is equal to " + operandA + ", and your B operand is equal to " + operandB + ".");
	}
	
	public ConsoleCalc(float a, float b) {
		System.out.println("You don't have to enter any number, it's already made for you in code!");
		operandA = a;
		operandB = b;
	}
	
	public void Addition() {
		float add = operandA + operandB;
		System.out.println("The result of addition is equal to " + add);
	}
	
	public void SubstractionAB() {
		float subAB = operandA - operandB;
		System.out.println("The result of substraction is equal to " + subAB);
	}
	
	public void SubstractionBA() {
		float subBA = operandB - operandA;
		System.out.println("The result of substraction is equal to " + subBA);
	}
	
	public void Multiplication() {
		float multi = operandA * operandB;
		System.out.println("The result of multiplication is equal to " + multi);
	}
	
	public void DivisionAB() {
		float divAB = operandA / operandB;
		System.out.println("The result of division is equal to " + divAB);
	}
	
	public void DivisionBA() {
		float divBA = operandB / operandA;
		System.out.println("The result of division is equal to " + divBA);
	}
}
