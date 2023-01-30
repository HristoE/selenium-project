package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_dropdown_intro {

    WebDriver driver;

    @BeforeMethod
    public void setUpMetod() {

        // TC#5: Verifying “Simple dropdown” and “State selection” dropdown
        // default values
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simple_dropdown_test() {


        //3. Verify “Simple dropdown” default selected value is correct
        //xpected: “Please select an option”

        WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id= 'dropdown']"));
        Select select = new Select(simpleDropdown);

        String expectedDefaultValue = "“Please select an option”";
        String actualdefaultValue = select.getFirstSelectedOption().getText();

        Assert.assertEquals(actualdefaultValue, expectedDefaultValue);
        Assert.assertTrue(actualdefaultValue.equals(expectedDefaultValue));

        // 4. Verify “State selection” default selected value is correct
        //Expected: “
        // Select a State”
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id= 'state']")));

        String expectedDefaultStateValue = "Select a State";
        String actualDefaultValue = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDefaultValue, expectedDefaultStateValue);


    }
    // TC#5: Verifying “Simple dropdown” and “State selection” dropdown
    // default values
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    //3. Verify “Simple dropdown” default selected value is correct
    //xpected: “Please select an option”
    // 4. Verify “State selection” default selected value is correct
    //Expected: “
    // Select a State”


    @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
