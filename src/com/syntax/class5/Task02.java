package com.syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task02 {
    public static String url="https://www.ebay.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement catigories=driver.findElement(By.id("gh-cat"));
        Select select=new Select(catigories);

        List<WebElement> allOptions=select.getOptions();
        for (WebElement option:allOptions) {
            String allText=option.getText();
            System.out.println(allText);
            select.selectByVisibleText("Computers/Tablets & Networking");//it works

        }
    }
}
