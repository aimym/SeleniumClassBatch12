package com.syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork01 {
    public static String url="https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement createAccountButton=driver.findElement(By.xpath("//a[text() = 'Create new account']"));
        createAccountButton.click();
        Thread.sleep(2000);
        WebElement daysoptions=driver.findElement(By.cssSelector("select#day"));
        Select days=new Select(daysoptions);
         //days.selectByValue("5");
        // Thread.sleep(2000);
        // days.selectByIndex(0);
        // Thread.sleep(2000);
        // days.selectByVisibleText("25");

         List<WebElement> options=days.getOptions();
        // int size=options.size();
       // System.out.println(size);//31

        for(WebElement option:options){
           // System.out.println(option.getText());//it works.your output:123456...
            System.out.println(option.getAttribute("value"));//it works.your output:123456...
        }













         }

}

