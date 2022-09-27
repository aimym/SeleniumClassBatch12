package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();
       // Thread.sleep(2000);<--this method can hold your execution for 2sec,but it does not recommended
        driver.navigate().refresh();
        //driver.close();<--will close the current tab,but we'll not use it in real life
        driver.quit();//<--will quit the whole browser
    }


}
