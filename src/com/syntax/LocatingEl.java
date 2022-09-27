package com.syntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingEl {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://fb.com");
        driver.findElement(By.id("email")).sendKeys("Syntax2ahsjdj.com");
        driver.findElement(By.id("pass")).sendKeys(("whatever"));
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Forgot password?")).click();

    }
}
