package easy;

public class LongToByte {

	public static void main(String[] args) {
		byte byteNum;
		long longNum;
		
		int byteRange = Math.abs(Byte.MIN_VALUE) + Byte.MAX_VALUE + 1;
		System.out.println("Byte range is " + byteRange);
		
		longNum = 2150000000L;
		System.out.println("Long Num is " + longNum); // ������ �����
		
		byteNum = (byte) longNum;
		System.out.println("Byte num is " + byteNum); // �������� int
		
		long modulo = longNum % byteRange; // �������
		System.out.println("Modulo of division long value by byte range is " + modulo);
		
		long delta = modulo - Byte.MAX_VALUE; // ������� ��� ��� ����� ���������
		System.out.println("Delta between modulo and max byte value " + delta);
		
		long resultLongValue = Byte.MIN_VALUE + delta - 1; // �������� int
		System.out.println("Long min value increased on delta " + resultLongValue);
	}

}
