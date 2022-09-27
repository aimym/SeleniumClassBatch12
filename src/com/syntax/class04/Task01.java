package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auto/login");

       // WebElement login= driver.findElement(By.xpath("//div[text() = 'LOGIN Panel']"));

       WebElement username=driver.findElement(By.xpath("//span[text() = 'Username']/preceding-sibling::input"));
       username.sendKeys("Admin");

     WebElement password=driver.findElement(By.xpath("//span[text() = 'Password']/preceding-sibling::input"));
      password.sendKeys("Hum@nhrm123");

      WebElement loginButton= driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
      loginButton.click();
    }
}
