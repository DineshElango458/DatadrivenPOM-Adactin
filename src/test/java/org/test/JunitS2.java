package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitS2 {
	
	@BeforeClass
	public static void beforeclas() {
		System.out.println("beforeclass");
	}
	@AfterClass
	public static  void afterclass() {
		System.out.println("aftercalss");
	}
	@Before
	public void beforemethod() {
		System.out.println("before");
	}
	@After
	public void aftermethod() {
		System.out.println("after");

	}
	
	@Test
	public void testcase1() {
		String s = "abc";
		Assert.assertEquals(s, "Abc");
		System.out.println("2");
		System.out.println("din");
	}
	@Test
	public void testcase2() {
		System.out.println("1");
	}
	@Test
public void testcase3() {
	System.out.println("3");

}
	
	

}
