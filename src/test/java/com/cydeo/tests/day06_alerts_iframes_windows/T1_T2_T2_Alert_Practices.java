package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T2_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }


    @Test

    public void information_allert_test1() throws InterruptedException {


        //3. Click to “Click for JS Alert” button
        WebElement informationAllertButton = driver.findElement(By.xpath("// button[.= 'Click for JS Alert']"));

        informationAllertButton.click();
        // 4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.

        WebElement resultText = driver.findElement(By.xpath("// p[@id = 'result']"));
        Assert.assertTrue(resultText.isDisplayed(), "result text is NOT displayed");
        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();
        Assert.assertEquals(actualText, expectedText, "Actual resut text is Not as expected");

    }


    @Test
    public void confirmation_alert_test2() throws InterruptedException {
        // 3. Click to “Click for JS Confirm” button
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmationAlert.click();
        // 4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
        // 5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id ='result']"));
        Assert.assertTrue(resultText.isDisplayed(),"NOT PASSING CONFORMATIONAL ALERT TEST ");


    }









    @AfterMethod

    public void tearDownMethod() {

        driver.close();
    }
}
