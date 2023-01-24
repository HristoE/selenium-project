package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Go to http://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");



        //PS: Locate username input box using: “className” locator
        WebElement userNameInput = driver.findElement(By.className("form-control"));

        // Enter username: “incorrect@email.com”
        userNameInput.sendKeys("incorrect@email.com");

        WebElement passwordInput= driver.findElement(By.id("inputPassword"));


        //4. Enter password: “incorrect password”
        passwordInput.sendKeys("incorrect password");


WebElement signInButton = driver.findElement(By.tagName("button"));
signInButton.click();



driver.close();



    }
}
/*TC #4: Library verifications
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Verify: visually “Sorry, Wrong Email or Password”
displayed
Locate password input box using: “id” locator.
Locate Sign in button using : tagName Locator

 */