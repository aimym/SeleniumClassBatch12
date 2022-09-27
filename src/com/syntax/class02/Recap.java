package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");
        String title=driver.getTitle();
        String expectedTitle="Facebook - log in or sign up";

        if(title.equals(expectedTitle)){
            System.out.println("Title Is Correct");
        }else{
            System.out.println("Title Is not Correct");
        }
        driver.quit();
    }
}
