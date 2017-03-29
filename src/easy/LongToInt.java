package easy;

public class LongToInt {

	public static void main(String[] args) throws Exception {
		int intNum;
		long longNum;
		
		long intRange = Math.abs( (long) Integer.MIN_VALUE) + Integer.MAX_VALUE + 1; // �������� long
		System.out.println("Int range is " + intRange);
		
		longNum = 2150000000L;
		System.out.println("Long Num is " + longNum); // ������ �����
		
		intNum = (int) longNum;
		System.out.println("Int num is " + intNum); // �������� int
		
		long modulo = longNum % intRange; // �������
		System.out.println("Modulo of division long value by int range is " + modulo);
		
		long delta = modulo - Integer.MAX_VALUE; // ������� ��� ��� ����� ���������
		System.out.println("Delta between modulo and max int value " + delta);
		
		long resultIntValue = Integer.MIN_VALUE + delta - 1; // �������� int
		System.out.println("Int min value increased on delta " + resultIntValue);
	}

}
