package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//for windows users
        //users add extension .exe
        WebDriver driver=new ChromeDriver();//launch the browser
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);//https://www.google.com/
        String title = driver.getTitle();
        System.out.println(title);//Google
        //driver.quit();
    }
}
