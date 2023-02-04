package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_webTable_Order_Verify {

   // TC #1: Web table practice
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {


        //1. Go to:  https://practice.cydeo.com/web-tables

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
           @Test
     public void order_verify_name_test(){
               //Expected: “Bob Martin” -this is my locator //table[@class='SampleTable']/tbody/tr[7]/td[2]
               // this is how should be //table[@class='SampleTable']//td[.='Bob Martin']
               //3. Verify Bob Martin’s order date is as expected 12/31/2021


               WebElement bobsCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));
               String expected_name= "Bob Martin";
               String actualname = bobsCell.getText();
               Assert.assertEquals(actualname, expected_name," Name not matching");


               WebElement bobsDateOfBirth = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/../td[5]"));
String expectedDate = "12/31/2021";
String actualDate = bobsDateOfBirth.getText();
Assert.assertEquals(actualDate,expectedDate,"Fail date test ");
           }



}
