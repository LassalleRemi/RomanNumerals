package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
		//Given
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_1_when_I () {
		//Given
		String input = "I";
		String expected = "1";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	//3
	@Test
	public void should_return_III_when_3 () {
		//Given
		String input = "3";
		String expected = "III";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_3_when_III () {
		//Given
		String input = "III";
		String expected = "3";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_V_when_5 () {
		// Given
		String input = "5";
		String expected = "V";
		RomanNumerals romanNumeral = new RomanNumerals();
		// When
		String actual = romanNumeral.convertToRoman(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_5_when_V () {
		// Given
		String input = "V";
		String expected = "5";
		RomanNumerals romanNumeral = new RomanNumerals();
		// When
		String actual = romanNumeral.convertFromRoman(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_4_when_IV () {
		// Given
		String input = "IV";
		String expected = "4";
		RomanNumerals romanNumeral = new RomanNumerals();
		// When
		String actual = romanNumeral.convertFromRoman(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_904_when_CMIV () {
		// Given
		String input = "CMIV";
		String expected = "904";
		RomanNumerals romanNumeral = new RomanNumerals();
		// When
		String actual = romanNumeral.convertFromRoman(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_CMIV_when_904 () {
		// Given
		String input = "904";
		String expected = "CMIV";
		RomanNumerals romanNumeral = new RomanNumerals();
		// When
		String actual = romanNumeral.convertToRoman(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
}
