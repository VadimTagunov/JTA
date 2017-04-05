package CharSwitcher;

import java.util.*;

public class CharSwitcher {

	private String text = null;
	private String[] words = null;
	private int order;
	private char symbol;
	
	public CharSwitcher() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		text = sc.nextLine();
		System.out.println("Now enter your order: ");
		order = sc.nextInt();
		System.out.println("Finally, enter your symbol: ");
		symbol = sc.next().charAt(0);
		System.out.println("Great Job!");
		sc.close();
	}
	
	public CharSwitcher(String text, String[] words, int order, char symbol) {
		this.text = text;
		this.words = words;
		this.order = order;
		this.symbol = symbol;
	}
	
	public void Switch() {
		words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= (order)){
				words[i] = words[i].substring(0, order) + symbol + words[i].substring(order + 1);
			}
			else {
				
			}
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}
}
