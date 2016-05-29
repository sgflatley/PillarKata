package com.pillarkata;

public class RomanNumeral {

	private int value = 0;
	private int[] digitValues = {1000, 500, 100, 50, 10, 5, 1};
	private String[] digitNames = {"M", "D", "C", "L", "X", "V", "I"};

	private int[] repeatableValues = {1000, 100, 10, 1};
	private String[] repeatableNames = {"M", "C", "X", "I"};

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
			if (i > 0 && 
				(new Integer(workingNumber).toString().indexOf('4') == 0 ||
				 new Integer(workingNumber).toString().indexOf('9') == 0))
			{ 
				for (int j = 0; j < repeatableValues.length; j++)
				{
					int localWorkingNumber = (workingNumber / repeatableValues[j]) * repeatableValues[j];

					if (workingNumber == 4)
					{
						builder.append("IV");
						workingNumber -= 4;
						break;
					}
					else if (workingNumber == 9)
					{
						builder.append("IX");
						workingNumber -= 9;
						break;	
					}
					else if (workingNumber == (digitValues[i-1] - repeatableValues[j]))
					{
						builder.append(repeatableNames[j]);
						builder.append(digitNames[i-1]);
						
						break;
					}
					else if (j>0 && localWorkingNumber == (digitValues[i-1] - repeatableValues[j]))
					{
						builder.append(repeatableNames[j]);
						builder.append(digitNames[i-1]);
						workingNumber = workingNumber - localWorkingNumber;
						
						break;
					}
				}
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