package com.cydeo.tests.review.week3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HardSoftAssertion {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        // TC#1: Registration Form Page Testing
        // 1. Open Chrome browser
        // 2. Go to https://practice.cydeo.com/registration_form
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/registration_form");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test

    public void registration_form_page_hardAssert_test(){
        // 3. Verify title is as expected:
        // Expected: "Registration Form"

        String actualTitle = driver.getTitle();
        String expectedTitle = "Registration Form";

        Assert.assertTrue(actualTitle.equals(expectedTitle), "Title Verification is failed ");

        // 4. Select "SDET" from Job title dropdown
        // 5. Verify "SDET" is selected

        Select selectJobtitle = new Select(driver.findElement(By.name("job_title")));
        //selectJobtitle.selectByVisibleText("SDET");
        selectJobtitle.selectByIndex(4);

        Assert.assertTrue(selectJobtitle.getFirstSelectedOption().getText().equals("SDET"));


    }


    public void registration_form_page_softAssert_test() {
        // 3. Verify title is as expected:
        // Expected: "Registration Form"

        String actualTitle = driver.getTitle();
        String expectedTitle = "Registration Form";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);

        // 4. Select "SDET" from Job title dropdown
        // 5. Verify "SDET" is selected

        Select selectJobtitle = new Select(driver.findElement(By.name("job_title")));
        //selectJobtitle.selectByVisibleText("SDET");
        selectJobtitle.selectByIndex(4);

        String actualSelectedOption = selectJobtitle.getFirstSelectedOption().getText();
        String expectedSelectedOption = "SDET";
        softAssert.assertEquals(selectJobtitle, expectedSelectedOption);

        softAssert.assertAll();



    }

}
