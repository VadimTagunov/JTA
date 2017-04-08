package CharSwitcher;

import java.util.*;
import java.util.regex.Pattern;

public class CharSwitcher {

	private String text = null;
	private String[] words = null;
	private int pos;
	private char symbol;
	
	public CharSwitcher() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		text = sc.nextLine();
		System.out.println("Now enter your order: ");
		pos = sc.nextInt();
		System.out.println("Finally, enter your symbol: ");
		symbol = sc.next().charAt(0);
		System.out.println("Great Job!");
		sc.close();
	}
	
	public CharSwitcher(String text, String[] words, int pos, char symbol) {
		this.text = text;
		this.words = words;
		this.pos = pos;
		this.symbol = symbol;
	}
	
	public void Switch() {
		words = text.split("[ ,.:;?!]");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > (pos)){
				words[i] = words[i].substring(0, pos) + symbol + words[i].substring(pos + 1);
			}
			else {
				words[i] = words[i];
			}
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}
}