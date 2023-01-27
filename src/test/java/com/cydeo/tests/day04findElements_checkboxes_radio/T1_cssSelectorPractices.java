package com.cydeo.tests.day04findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_cssSelectorPractices {

    public static void main(String[] args) throws InterruptedException {


        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        // a. “Home” link
        // WebElement HomeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //3. Locate all the WebElements on the page using XPATH and/or CSS Synax 2

        // WebElement HomeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href= '/']"));
        //locator only (total of 6)

        //b. “Forgot password” header
        WebElement header = driver.findElement(By.xpath(" //h2[.='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.xpath("// input[contains(@pattern, 'a-z')]"));

        // e. “Retrieve password” button

        WebElement retrivePasswordButton = driver.findElement(By.xpath("//button[@id = 'form_submit']"));
        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//DIV[@ style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex3.isDisplayed() = " + homeLink_ex3.isDisplayed());
        System.out.println("header.isDisplayed() = " + header.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        /*First solve the task with using cssSelector only. Try to create 2 different
        cssSelector if possible
        Then solve the task using XPATH only. Try to create 2 different
        XPATH locator if possible

         */
        Thread.sleep(2000);
        driver.close();
    }


}
