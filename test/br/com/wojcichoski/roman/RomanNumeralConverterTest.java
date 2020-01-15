package br.com.wojcichoski.roman;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralConverterTest {

	private static void assertValueEquals(String romanNumeral, int intNumber) {
		Assert.assertEquals(romanNumeral, RomanNumeralConverter.toRomanNumeral(intNumber));
	}

	@Test
	public void toRomanNumeralTest() {
		assertValueEquals("I", 1);
		assertValueEquals("II", 2);
		assertValueEquals("III", 3);
		assertValueEquals("IV", 4);
		assertValueEquals("V", 5);
		assertValueEquals("VI", 6);
		assertValueEquals("VII", 7);
		assertValueEquals("VIII", 8);
		assertValueEquals("IX", 9);
		assertValueEquals("X", 10);
		assertValueEquals("XI", 11);
		assertValueEquals("XIV", 14);
		assertValueEquals("XV", 15);
		assertValueEquals("XVI", 16);
		assertValueEquals("XIX", 19);
		assertValueEquals("XX", 20);
		assertValueEquals("XL", 40);
		assertValueEquals("L", 50);
		assertValueEquals("LX", 60);
		assertValueEquals("XC", 90);
		assertValueEquals("C", 100);
		assertValueEquals("CX", 110);
		assertValueEquals("D", 500);
		assertValueEquals("M", 1000);
		assertValueEquals("MM", 2000);
	}
}
