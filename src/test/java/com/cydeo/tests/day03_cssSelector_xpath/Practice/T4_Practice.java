package com.cydeo.tests.day03_cssSelector_xpath.Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_Practice {
    public static void main(String[] args) {

        //Practice Cydeo – xpath locator practice

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        //3- Click to “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        homeLink.click();

        //4- Verify title is as expected:
        //Expected: Practice


        String expectedTitle = "Practice";

        String actualTitle = driver.getTitle();
      if(expectedTitle.equals(actualTitle)){
            System.out.println( "Title Verification Passed");
       }else //System.out.println("Title Verification failed");
        System.out.println(actualTitle);


        // PS: Locate “Home” link using “xpath” locator

driver.close();
    }

}
