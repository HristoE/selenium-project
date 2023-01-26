package com.cydeo.tests.day03_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    public static void main(String[] args) {

        // TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://login1.nextbasecrm.com
        driver.get("https://login1.nextbasecrm.com");

        //3. Enter username: “incorrect”
       WebElement inputUserName =  driver.findElement(By.className("login-inp"));
       inputUserName.sendKeys("Incorrect");


        //4. Enter password: “incorrect”
        WebElement inputUserPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputUserPassword.sendKeys("Incorrect");

        //5. Click to the login button:
          WebElement loginButton = driver.findElement(By.className("login-btn"));
          loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        String expectedErrorText = "Incorrect login or password";
       String actualErrorMessage =  driver.findElement(By.className("errortext")).getText();
        if(actualErrorMessage.equals(expectedErrorText) ){
            System.out.println( "Error text verification passes ");
        }else {
            System.out.println( "Fail verification ");
        }


        driver.close();
    }
}
