package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {
	@Test
	public void testSubtract() {
		Subtractor subtractor = new Subtractor();
		int actualResult = subtractor.subtract(4,1);
		Assert.assertEquals("Incorrect subtract result returned", 3, actualResult);
	}

}
