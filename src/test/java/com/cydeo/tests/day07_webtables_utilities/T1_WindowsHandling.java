package com.cydeo.tests.day07_webtables_utilities;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class T1_WindowsHandling {
//TC #1: Window Handle practice


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #1: Window Handle practice
        //1. Create new test and make setups
        //2. Go to : https://www.amazon.com

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();


    }


    @Test

    public void window_handling() {


        //3. Copy/paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        //4. Create a logic to switch to the tab where Etsy.com is open
        // - store all windowHandles in a set
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URl: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }

        }

        //5. Assert: Title contains “Etsy”
        String actualTitle = driver.getTitle();
        String expectedinTitle = "Etsy";


        Assert.assertTrue(actualTitle.contains(expectedinTitle),"Title dont match expected, test fai");
        // Lines to be pasted:
        // ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        //((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        //((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        // These lines will simply open new tabs using something called JavascriptExecutor

    }
}
