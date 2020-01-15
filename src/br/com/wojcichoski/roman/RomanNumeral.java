package br.com.wojcichoski.roman;

public class RomanNumeral {

	private String romanValue;	
	
	public RomanNumeral(int value) {
		this.romanValue = RomanNumeralConverter.toRomanNumeral(value);
	}
	
	public String toString() {
		return this.romanValue;
	}
}
