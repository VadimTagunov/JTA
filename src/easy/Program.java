package easy;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("������� ���� �� ������ ������?");
		Scanner in = new Scanner(System.in);
		int nameCount = in.nextInt();
		in.nextLine();
		String[] names = new String[nameCount];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("������� ���:");
			names[i]= in.nextLine();
		}
		
		System.out.println("�� ����� ��������� �����:");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		in.close();
	}
}
