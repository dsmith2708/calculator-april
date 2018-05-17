package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

	@Test
	public void test() {
		Adder adder = new Adder();
		int actualResult = adder.add(2,2);
		Assert.assertEquals("Incorrect result returned", 4, actualResult);
	}

}
