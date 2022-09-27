package com.syntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String url = driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(url+" "+title);
        String expectedTitle="Facebook - log in or sign up";
        if(title.equals(expectedTitle)){
            System.out.println("Is correct");
        }else{
            System.out.println("False");
        }
        driver.findElement(By.name("firstname")).sendKeys("Aidana");
        Thread.sleep(2000);


        }



    }



