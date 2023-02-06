package com.cydeo.tests.review.week3;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AllertPractice extends TestBase {


   /* WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //    1. Open browser
        //    2. Go to website: https://practice.cydeo.com/javascript_alerts


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }



*/

    @Test
    public void prompt_alert_test() {

        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement jsPromptAlert = driver.findElement(By.xpath("//button[@onclick= 'jsPrompt()']"));
        jsPromptAlert.click();
        //    3. Click to “Click for JS Prompt” button
        Alert alert = driver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());

        // 4. Send “hello” text to alert
        alert.sendKeys("hello");
        //    5. Click to OK button from the alert
        alert.accept();
        //    6. Verify “You entered: hello” text is displayed

        WebElement resultext = driver.findElement(By.id("result"));
        String actualText= resultext.getText();
        String expected = "hello";
        Assert.assertTrue( actualText.contains(expected), "Text test is passing  ");
        System.out.println("resultext.getText() = " + resultext.getText());

    }
}