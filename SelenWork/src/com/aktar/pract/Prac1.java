package com.aktar.pract;

import com.thoughtworks.selenium.DefaultSelenium;

public class Prac1 {

	public static void main(String[] args) {
	DefaultSelenium james=new DefaultSelenium("localhost",4444,"Firefox","https://www.facebook.com/");
	james.start();
	james.open("/");
	james.type("email", "aktarchowdhury7@gmail.com");
	james.type("pass", "aa786786");
	james.click("loginbuton");
	james.stop();
	james.close();

	}

}
