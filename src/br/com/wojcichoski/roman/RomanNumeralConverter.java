package br.com.wojcichoski.roman;

import java.util.Arrays;

public class RomanNumeralConverter {

	private static Integer[] integers = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
	private static String[] romans = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

	public static String toRomanNumeral(int value) {
		String result = "";
		for (int i = 12; i >= 0; i--) {
			if (value >= integers[i]) {
				int n = value / integers[i];
				result += romans[i].repeat(n);
				value -= n * integers[i];
			}
		}
		return result;
	}

	public static int toIntValue(String romanNumeral) {
		int result = 0;
		for (int i = 0; i < romanNumeral.length(); i++) {
			int a = integers[Arrays.asList(romans).indexOf(String.valueOf(romanNumeral.charAt(i)))];
			if (i + 1 < romanNumeral.length()) {
				int b = integers[Arrays.asList(romans).indexOf(String.valueOf(romanNumeral.charAt(i + 1)))];
				if (a < b) {
					result += (b - a);
					i++;
				} else {
					result += a;
				}
			} else {
				result += a;
			}
		}
		return result;
	}
}
