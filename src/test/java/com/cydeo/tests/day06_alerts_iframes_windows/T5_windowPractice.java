package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_windowPractice {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //TC #5: Window Handle practice
        //1. Create a new class called: T5_WindowsPractice
        //2. Create new test and make Setups.
        //3. Go to : https://practice.cydeo.com/windows

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void multiple_window_test() {
         //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        String mainHandle= driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);


        //5. Click to: “Click Here” link

        WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
        // 6. Switch to new Window.

        for (String each:driver.getWindowHandles() ) {
            driver.switchTo().window(each);
            System.out.println(" Current Title while switching "+ driver.getTitle());
        }

        // 7. Assert: Title is “New Window”

        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitleAfterClick);
    }
    @AfterMethod

    public void tearDownMethod() {

        driver.quit();
    }
}
