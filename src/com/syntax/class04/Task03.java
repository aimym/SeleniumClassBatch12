package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auto/login");

        WebElement username=driver.findElement(By.xpath("//span[text() = 'Username']/preceding-sibling::input"));
        username.sendKeys("Admin");

        WebElement password=driver.findElement(By.xpath("//span[text() = 'Password']/preceding-sibling::input"));
        password.sendKeys("");

        WebElement loginButton= driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
        loginButton.click();

       WebElement passwordEmpty= driver.findElement(By.xpath("//span[text() = 'Password cannot be empty']"));
       boolean isPasswordEmpty=passwordEmpty.isDisplayed();
        System.out.println(isPasswordEmpty);//true
    }
}
