package iut.tdd;

public class RomanNumerals {
	String[] r = new String[]{"I","V","X","L","D","C","M"};
	int[] n = new int[]{1,5,10,50,100,500,1000};
	
	public String convertToRoman(String arabe) {
		if (arabe.equals("1")) return "I";
		else if (arabe.equals("5")) return "V";
		else return "";
	}

	public String convertFromRoman(String roman) {
		if (roman.equals("I")) return "1";
		else if (roman.equals("V")) return "5";
		else return "";
	}

}
