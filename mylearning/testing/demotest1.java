package testing;

import demo.demotest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class demotest1 {
	
	@BeforeEach    //executes before every testcase
	public void before()
	{
		System.out.println("BeforeEach");
	}
	
	@AfterEach		//executes after every testcase
	public void after()
	{
		System.out.println("AfterEach");
	}
	
	@BeforeAll    //executes before all testcases
	public void beforeall()
	{
		System.out.println("BeforeAll");
	}
	
	@AfterAll    //executes before all testcases
	public void afterall()
	{
		System.out.println("AfterAll");
	}
	
	@Test
	@DisplayName("Demo on 1st test")
	public void test1()
	{
		demotest d1 = new demotest();
		//System.out.println(d1.add(2,3));
		int a = d1.add(10, 20);
		System.out.println(a);
		assertEquals(a,30); //compares a with 30 whether both are same
	}
	
	@Test
	@DisplayName("Demo on 2nd test")
	@Disabled("Need to work")
	public void test2()
	{
		demotest d1 = new demotest();
		//System.out.println(d1.add(2,3));
		int a = d1.add(1, 2);
		System.out.println(a);
		assertEquals(a,3); //compares a with 30 whether both are same
	}
	
	@Test
	@DisplayName("Demo on 3rd test")
	public void test3()
	{
		demotest d1 = new demotest();
		//System.out.println(d1.add(2,3));
		int a = d1.add(1, 2);
		System.out.println(a);
		assertEquals(a,3); //compares a with 30 whether both are same
	}
	
	@RepeatedTest(value=3)
	public void test4()
	{
		demotest d1 = new demotest();
		//System.out.println(d1.add(2,3));
		int a = d1.add(11, 12);
		System.out.println(a);
		assertEquals(a,3); //compares a with 30 whether both are same
	}

}
