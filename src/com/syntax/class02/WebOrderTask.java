package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" http://secure.smartbearsoftware.com/Samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        String title=driver.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is not correct");
        }
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();

    }



}
