package com.syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver dr=new ChromeDriver();
        dr.get("https://www.google.com");
        String url = dr.getCurrentUrl();

       String title= dr.getTitle();
        System.out.println(url+ " "+title);
        //dr.navigate().to("https://www.google.com/");
       // dr.navigate().to("https://www.amazon.com/");
        //dr.manage().window().maximize();
       // dr.navigate().back();
       // dr.navigate().forward();


    }
}
