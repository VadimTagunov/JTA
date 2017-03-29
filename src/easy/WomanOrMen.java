package easy;

import java.util.Scanner;

public class WomanOrMen {

	public static void main(String[] args) {
		System.out.println("Either you a woman or a men?");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		switch(a) {
			case "Да": {
				System.out.println("Вы мужчина или женщина?");
				String b = sc.nextLine();
				
				switch(b) {
					case "М":
					case "О":					
					case "Ж": {
						System.out.println("Привет, женщина.");
						break;
					}
					
					default: {
						System.out.println("Что-то неправильно.");
					}
				}
				
	            break;
			}
			
			case "Нет": {
				System.out.println("Привет, Никто.");
				break;
			}
			
			default: {
				System.out.println("Что-то неправильно");
				break;
			}
		}
	
		sc.close();
	}
}
		