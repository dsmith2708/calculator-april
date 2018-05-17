package com.qa.mathoperations;


import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		Multiplier multiplier = new Multiplier();
		int actualResult = multiplier.multiply(3,2);
		Assert.assertEquals("Incorrect add result returned", 6, actualResult);
	}

}
