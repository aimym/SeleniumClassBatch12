package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String url= driver.getCurrentUrl();
        System.out.println(url);//https://www.amazon.com/
        String title= driver.getTitle();
        System.out.println(title);//Amazon.com. Spend less. Smile more.
       // driver.quit();
    }
}
