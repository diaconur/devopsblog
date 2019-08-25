package com.example.devopsblog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Method;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsblogApplicationTests {

	@Test
	public void testmethod1() {
		System.out.println("Test for "+new Object() {}.getClass().getEnclosingMethod().getName());
	}

	@Test
	public void testmethod2() {
		System.out.println("Test for "+new Object() {}.getClass().getEnclosingMethod().getName());
	}
	@Test
	public void testmethod3() {
		System.out.println("Test for "+new Object() {}.getClass().getEnclosingMethod().getName());
	}
	@Test
	public void testmethod4() {
		System.out.println("Test for "+new Object() {}.getClass().getEnclosingMethod().getName());
	}
	@Test
	public void testmethod5() {
		System.out.println("Test for "+new Object() {}.getClass().getEnclosingMethod().getName());
	}

}
