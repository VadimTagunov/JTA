package easy;

import java.util.Scanner;

public class WomanOrMen {

	public static void main(String[] args) {
		System.out.println("Either you a woman or a men?");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		switch(a) {
			case "��": {
				System.out.println("�� ������� ��� �������?");
				String b = sc.nextLine();
				
				switch(b) {
					case "�":
					case "�":					
					case "�": {
						System.out.println("������, �������.");
						break;
					}
					
					default: {
						System.out.println("���-�� �����������.");
					}
				}
				
	            break;
			}
			
			case "���": {
				System.out.println("������, �����.");
				break;
			}
			
			default: {
				System.out.println("���-�� �����������");
				break;
			}
		}
	
		sc.close();
	}
}
		