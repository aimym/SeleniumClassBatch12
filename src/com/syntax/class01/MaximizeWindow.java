package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();//<-- in real life's we'll be using this method
       // driver.manage().window().fullscreen();<--we will not use it

    }
}
