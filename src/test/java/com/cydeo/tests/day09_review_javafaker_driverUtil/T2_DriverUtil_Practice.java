package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T2_DriverUtil_Practice {

    // WebDriver driver;
    //@BeforeMethod
    //public void setupMethod(){
    //  //1- Open a Chrome browser
    //driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
    //driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    @Test
    public void bing_search_test() {
        //3- Write “apple” in search box
        // Go to: https://bing.com

       Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));
        //locate the search box
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        //Expected: flowers - Search
        String actualTitle = Driver.getDriver().getTitle();

        //String expectedTitle = "apple - Search";
        //We are just making the expectedTitle dynamic based on the text we are searching.
        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Search";

        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }


}
