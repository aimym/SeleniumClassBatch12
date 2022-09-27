package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Form");

        WebElement marriedRadioButton=driver.findElement(By.xpath("(//input[@name= 'optradio'])[1]"));
        boolean isMarriedRadioButtonEnabled=marriedRadioButton.isEnabled();
        System.out.println(isMarriedRadioButtonEnabled);//true

        if(!isMarriedRadioButtonEnabled) {
            System.out.println("Not Enabled");
        }else{
            System.out.println("Enabled");
        }//Enabled

        boolean isMarriedRadioButtonDisplayed=marriedRadioButton.isDisplayed();
        System.out.println(isMarriedRadioButtonDisplayed);//true

        boolean isMarriedRadioButtonSelected=marriedRadioButton.isSelected();
        System.out.println(isMarriedRadioButtonSelected);//False
        marriedRadioButton.click();
        isMarriedRadioButtonSelected=marriedRadioButton.isSelected();
        System.out.println("After clicking "+ isMarriedRadioButtonSelected);//true
        driver.quit();

    }
}
