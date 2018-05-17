package com.qa.mathoperations;


import org.junit.Assert;
import org.junit.Test;

public class DividorTest {

	@Test
	public void testAdd() {
		Dividor dividor = new Dividor();
		int actualResult = dividor.divide(6,2);
		Assert.assertEquals("Incorrect add result returned", 3, actualResult);
	}

}
