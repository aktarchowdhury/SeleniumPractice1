package com.aktar.sele;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleClass {
public static void main(String[]args){
DefaultSelenium jack=new DefaultSelenium("localhost",4444,"Firefox","https://www.facebook.com/");
jack.start();
jack.open("/");
jack.setSpeed("2000");
jack.windowMaximize();
jack.type("email", "aktarchowdhury7@gmail.com");
jack.type("pass", "aa786786");
jack.click("log in");
jack.stop();
jack.close();
}
}
