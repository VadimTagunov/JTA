package easy;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Сколько имен Вы хотите ввести?");
		Scanner in = new Scanner(System.in);
		int nameCount = in.nextInt();
		in.nextLine();
		String[] names = new String[nameCount];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Введите имя:");
			names[i]= in.nextLine();
		}
		
		System.out.println("Вы ввели следующие имена:");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		in.close();
	}
}
