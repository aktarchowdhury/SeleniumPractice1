package com.aktar.annotations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationClass {
	@BeforeClass
	public static void OpenBrowser() {
		System.out.println("Browser opens");
	}

	@Before
	public void openHomePage() {
		System.out.println("Home Page Opens");
	}

	@Test
	public void SignIn() {
		System.out.println("Sign in Home Page");
	}

	@After
	public void TestDone() {
		System.out.println("Sign in Performed");
	}

	@AfterClass
	public static void CloseBrowser() {
		System.out.println("Browser closed ");
	}

}