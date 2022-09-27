package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
       List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        System.out.println("Number of links "+allLinks.size());//440

        for(WebElement link:allLinks){
            String linkText= link.getText();
            String fullLink=link.getAttribute("href");
            if(!linkText.isEmpty()){
                System.out.println(linkText+" "+fullLink);
            }
        }

    }
}
