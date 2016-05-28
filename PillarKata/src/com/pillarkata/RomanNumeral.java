package com.pillarkata;

public class RomanNumeral {

	private int value = 0;
	
	public RomanNumeral(int i) {
		value = i;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < value; i++)
		{
			builder.append('I');
		}
		return builder.toString();
	}
}