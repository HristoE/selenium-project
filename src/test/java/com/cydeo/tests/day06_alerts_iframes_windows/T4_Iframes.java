package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

import java.time.Duration;

public class T4_Iframes {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {

        //TC #4: Iframe practice
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/iframe");

    }



    @Test
    public void iframe_test(){

       // 4. Assert: “Your content goes here.” Text is displayed.
        //- we need to switch to iframe
        //option#1 - switch "id"attribute value
        //driver.switchTo().frame("mce_0_ifr");

        //option#2 - switch using "index number
        //driver.switchTo().frame(0); count the index numbers when search


        // option #3 - switch using WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id= 'mce_0_ifr']")));

        WebElement paragraphText = driver.findElement(By.xpath("// p[.='Your content goes here.']"));

        Assert.assertTrue(paragraphText.isDisplayed());
       // 5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        Assert.assertTrue(paragraphText.isDisplayed());
        driver.switchTo().parentFrame();
        WebElement h3= driver.findElement(By.tagName("h3"));
 Assert.assertTrue(h3.isDisplayed());





    }


    @AfterMethod

    public void tearDownMethod() {

        driver.close();
    }
}
