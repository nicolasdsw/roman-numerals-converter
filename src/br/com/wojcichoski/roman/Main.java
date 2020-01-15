package br.com.wojcichoski.roman;

public class Main {

	public static void main(String[] args) {
		for (int value = 1; value < 5000; value++) {
			System.out.println(value + " = " + new RomanNumeral(value)  + " = " + RomanNumeralConverter.toIntValue(new RomanNumeral(value).toString()));
		}
	}

}
