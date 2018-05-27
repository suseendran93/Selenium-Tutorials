package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)
	
	public void count() {
		System.out.println(3+2);
	}
	
}
