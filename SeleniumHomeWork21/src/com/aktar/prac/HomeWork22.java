package com.aktar.prac;
import com.thoughtworks.selenium.DefaultSelenium;
public class HomeWork22 {	 
		public static void main(String[]args){
			DefaultSelenium test= new DefaultSelenium("localhost",4444,"Firefox","https://www.facebook.com/");
			test.open("/");
			test.type("email", "aktarchowdhury7@gmail.com");
			test.type("pass", "aa786786");
			test.click(	"Log In");
			test.close();
			test.stop();
			
		}


		}


