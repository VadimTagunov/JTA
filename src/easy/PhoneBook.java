package easy;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������� ����� � ����� ���������� �����?");
		int count = sc.nextInt();
		
		String [][] phonebook = new String [3][count];
		
		System.out.println("����, � ����� ���������� ����� " + count + " ���� ��� ����, ������� � �������. ������� �� ��������!");
		sc = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			System.out.println("������� ���:");
			phonebook[0][i] = sc.nextLine();
			System.out.println("������� �������:");
			phonebook[1][i] = sc.nextLine();
			System.out.println("������� �����:");
			phonebook[2][i] = sc.nextLine();
			}
	
		for (int i = 0; i < count; i++) {
			int a = i + 1;
			System.out.println(a + " ������ � �����: ");
			System.out.println("���: " + phonebook[0][i]);
			System.out.println("�������: " + phonebook[1][i]);
			System.out.println("�����: " + phonebook[2][i]);
		}
	}
}
