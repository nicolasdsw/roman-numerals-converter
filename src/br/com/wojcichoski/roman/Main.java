package br.com.wojcichoski.roman;

public class Main {

	public static void main(String[] args) {
		try {
			int intVal = Integer.parseInt(args[0]);
			System.out.println(intVal + " = " + RomanNumeralConverter.toRomanNumeral(intVal));
		} catch (NumberFormatException e) {
			System.out.println(args[0] + " = " + RomanNumeralConverter.toIntValue(args[0]));
		}
	}

}
