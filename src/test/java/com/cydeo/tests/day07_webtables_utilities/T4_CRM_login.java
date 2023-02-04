package com.cydeo.tests.day07_webtables_utilities;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_CRM_login {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #4: Login scenario
        //1. Create new test and make setups
        //2. Go to: http://login1.nextbasecrm.com/
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://login1.nextbasecrm.com/");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test1_crm_login() {
        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name ='USER_LOGIN']"));
        //4. Enter valid password
        inputUserName.sendKeys("helpdesk1@cydeo.com");
        //5. Click to `Log In` button
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name ='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type ='submit']"));
        loginButton.click();
        //6. Verify title is as expected:
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver,"Portal");
        // Expected: Portal
        //USERNAME PASSWORD
        //helpdesk1@cydeo.com UserUser
        //helpdesk2@cydeo.com UserUser
    }

}
