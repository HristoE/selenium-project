package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T2_radioButtons {

    public static void main(String[] args) {
        /*   XPATH PRACTICES
             DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
             TC #2: Radiobutton handling
        */


        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to https://practice.cydeo.com/radio_buttons/
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id  ='hockey']"));
        hockeyButton.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        if( hockeyButton.isSelected()){
            System.out.println( "Hockey button is selected , verification passes");
        }else {
            System.out.println("Hockey button is selected , verification failing ");
        }

        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

driver.close();
    }
}
