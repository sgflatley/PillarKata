package com.pillarkata;

public class RomanNumeral {

	private int value = 0;
	private int[] digitValues = {1000, 500, 100, 50, 10, 5, 1};
	private String[] digitNames = {"M", "D", "C", "L", "X", "V", "I"};
	
	public RomanNumeral(int i) {
		value = i;
	}

	public String toString() {
		return createRepresentation();
	}

	
	private String createRepresentation() {
		StringBuilder builder = new StringBuilder();
		int workingNumber = value;
		for (int i = 0; i < digitValues.length; i++)
		{
			if (i > 0 && workingNumber == (digitValues[i-1] - 1))
			{
				builder.append("I");
				builder.append(digitNames[i-1]);
				break;
			}
			else
			{
				while (workingNumber >= digitValues[i])
				{
					builder.append(digitNames[i]);
					workingNumber = workingNumber - digitValues[i];
				}
			}
			
		}
		return builder.toString();
	}
}