//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		int decimal = 0;
		int lastdec = 0;
		int index = 0;
		for (int x=roman.length()-1; x>=0; x--) {
			char characteri = roman.charAt(x);
			for (int i=0; i<CharArray(LETTERS).length; i++) {
				if (CharArray(LETTERS)[i]==characteri) {
					index = i;
				}
			}
			decimal = decimalCheck(NUMBERS[index], lastdec, decimal);
			lastdec = NUMBERS[index];
		}
		return number;
	}
	
	public int decimalCheck(int decimal, int lastdec, int lastDecimal) {
		if (lastdec > decimal) {
			return lastDecimal - decimal;
		}
		else {
			return lastDecimal + decimal;
		}
	}
	
	public char[] CharArray(String[] str) {
		char[] charList = new char[str.length];
		for (int i=0;i<str.length; i++) {
			charList[i] = str[i].charAt(0);
			if (i%2!=0) {
				charList[i] = 'A';
			}
		}
		return charList;
	}

	public String toString()
	{
		int n = number;
		roman = "";
		for (int i=0; i<NUMBERS.length; i++) {
			while (NUMBERS[i]<=n) {
				roman = roman + LETTERS[i];
				n = n-NUMBERS[i];
			}
		} 
		return roman + " is " + number;
	}
}