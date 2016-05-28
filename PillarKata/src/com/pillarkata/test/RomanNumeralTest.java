package com.pillarkata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pillarkata.RomanNumeral;

public class RomanNumeralTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void whenGivenOneAnUpperCaseEyeReturned() {
		RomanNumeral romanNumber = new RomanNumeral(1);
		
		assertEquals("I", romanNumber.toString());
	}
	
	@Test
	public void whenGivenThreeIIIReturned() {
		RomanNumeral romanNumber = new RomanNumeral(3);
		
		assertEquals("III", romanNumber.toString());
	}

	@Test
	public void whenGivenFourIVReturned() {
		RomanNumeral numeral = new RomanNumeral(4);
		assertEquals("IV", numeral.toString());
	}

	@Test
	public void whenGivenNineIXReturned() {
		RomanNumeral numeral = new RomanNumeral(9);
		assertEquals("IX", numeral.toString());
	}
	
}

