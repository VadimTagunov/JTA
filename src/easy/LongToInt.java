package easy;

public class LongToInt {

	public static void main(String[] args) throws Exception {
		int intNum;
		long longNum;
		
		long intRange = Math.abs( (long) Integer.MIN_VALUE) + Integer.MAX_VALUE + 1; // диапазон long
		System.out.println("Int range is " + intRange);
		
		longNum = 2150000000L;
		System.out.println("Long Num is " + longNum); // просто число
		
		intNum = (int) longNum;
		System.out.println("Int num is " + intNum); // конечный int
		
		long modulo = longNum % intRange; // остаток
		System.out.println("Modulo of division long value by int range is " + modulo);
		
		long delta = modulo - Integer.MAX_VALUE; // сколько нам еще нужно запихнуть
		System.out.println("Delta between modulo and max int value " + delta);
		
		long resultIntValue = Integer.MIN_VALUE + delta - 1; // конечный int
		System.out.println("Int min value increased on delta " + resultIntValue);
	}

}
