package easy;

import java.util.*;
import java.lang.*;

class TextSwitcher {
	private String textInput = null;
	private String[] words = null;
	private int indexOfChar;
	private char symbol;
	
	public TextSwitcher(String string, int i, char c) {
		this.textInput = string;
		this.indexOfChar = i;
		this.symbol = c;
	}
	
	public void changeChar(String textInput) throws NullPointerException {
		words = textInput.split(" ");
		for (int a = 0; a < words.length; a++) {
			if (words[a].length() < indexOfChar) {
				StringBuilder str = new StringBuilder(words[a]);
				str.setCharAt(indexOfChar, symbol);
				System.out.print(str.toString() + " ");
			}
			else {
				System.out.print(words[a]);
			}
		}
	}
}