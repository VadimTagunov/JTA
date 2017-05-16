package wordSwitcher;

import java.util.Scanner;

public class WordSwitcher {

	private String userText;
	private String[] wordsArray;
	private int userLength;
	private String substring;
	
	public WordSwitcher() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text, then substring and the length of the word: ");
		
		userText = sc.nextLine();
		substring = sc.nextLine();
		userLength = sc.nextInt();
		
		sc.close();
	}
	
	public void switchWord() {
		wordsArray = userText.split("[ ,.:;?!]");
		for (int i = 0; i < wordsArray.length; i++) {
			if (wordsArray[i].length() == userLength){
				wordsArray[i] = substring;
			}
			else {
				wordsArray[i] = wordsArray[i];
			}
		}
	}
	
	public void printWordArray() {
		for (int i = 0; i < wordsArray.length; i++) {
			System.out.print(wordsArray[i] + " ");
		}
	}
}
