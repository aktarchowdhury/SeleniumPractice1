package com.aktar.work;

import com.thoughtworks.selenium.DefaultSelenium;

public class HomeWork1 {
public static void main(String[]args){
DefaultSelenium key=new DefaultSelenium("localhost",4444,"Firefox","https://www.facebook.com/");
key.start();
key.open("Browser");
key.type("email", "aktarchowdhury7@gmail.com");
key.type("pass", "aa786786");
key.click("Log In");
key.stop();
key.close();
}
}
