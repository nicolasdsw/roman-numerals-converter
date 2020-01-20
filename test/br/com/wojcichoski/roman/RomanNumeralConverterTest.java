package br.com.wojcichoski.roman;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralConverterTest {

	private static void assertValueEquals(String romanNumeral, int intNumber) {
		Assert.assertEquals(romanNumeral, RomanNumeralConverter.toRomanNumeral(intNumber));
		Assert.assertEquals(intNumber, RomanNumeralConverter.toIntValue(romanNumeral));
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
		assertValueEquals("XII", 12);
		assertValueEquals("XIII", 13);
		assertValueEquals("XIV", 14);
		assertValueEquals("XV", 15);
		assertValueEquals("XVI", 16);
		assertValueEquals("XVII", 17);
		assertValueEquals("XVIII", 18);
		assertValueEquals("XIX", 19);
		assertValueEquals("XX", 20);
		assertValueEquals("XXX", 30);
		assertValueEquals("XL", 40);
		assertValueEquals("L", 50);
		assertValueEquals("LX", 60);
		assertValueEquals("LXX", 70);
		assertValueEquals("LXXX", 80);
		assertValueEquals("XC", 90);
		assertValueEquals("C", 100);
		assertValueEquals("CX", 110);
		assertValueEquals("CL", 150);
		assertValueEquals("CC", 200);
		assertValueEquals("CCC", 300);
		assertValueEquals("CD", 400);
		assertValueEquals("D", 500);
		assertValueEquals("DC", 600);
		assertValueEquals("DCC", 700);
		assertValueEquals("DCCC", 800);
		assertValueEquals("CM", 900);
		assertValueEquals("M", 1000);
		assertValueEquals("MD", 1500);
		assertValueEquals("MM", 2000);
		assertValueEquals("MMM", 3000);
	}
	
	@Test
	public void printTest() {
		for (int value = 1; value <= 3000; value++) {
			String romanNum = RomanNumeralConverter.toRomanNumeral(value);
			int intNum = RomanNumeralConverter.toIntValue(romanNum);
			System.out.println(value + " = " + romanNum  + " = " + intNum);			
		}
	}
}
