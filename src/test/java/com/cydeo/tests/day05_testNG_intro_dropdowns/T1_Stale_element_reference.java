package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_Stale_element_reference {
    public static void main(String[] args) {


        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: StaleElementReferenceException handling

        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[.= 'Add Element']"));

        addElementButton.click();

        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[.= 'Delete']"));
        System.out.println("deleteButton.isDisplayed(), expecting true  = " + deleteButton.isDisplayed());


        // 5. Click to “Delete” button.

        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.

        try{

        System.out.println("deleteButton.isDisplayed(), expecting false  = ");
        }catch (StaleElementReferenceException e){
            System.out.println( "StaleElementReferenceException is displayed due web element is deleted from the page ");
            System.out.println( " Test is Passing ");
        }
        driver.close();


        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


    }
}
