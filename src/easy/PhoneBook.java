package easy;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Сколько человек будет в Вашей телефонной книге?");
		int count = sc.nextInt();
		
		String [][] phonebook = new String [3][count];
		
		System.out.println("Окей, в Вашей телефонной книге " + count + " мест для имен, номеров и адресов. Давайте их заполним!");
		sc = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			System.out.println("Введите имя:");
			phonebook[0][i] = sc.nextLine();
			System.out.println("Введите телефон:");
			phonebook[1][i] = sc.nextLine();
			System.out.println("Введите адрес:");
			phonebook[2][i] = sc.nextLine();
			}
	
		for (int i = 0; i < count; i++) {
			int a = i + 1;
			System.out.println(a + " запись в книге: ");
			System.out.println("Имя: " + phonebook[0][i]);
			System.out.println("Телефон: " + phonebook[1][i]);
			System.out.println("Адрес: " + phonebook[2][i]);
		}
	}
}
