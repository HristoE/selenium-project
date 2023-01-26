package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locators_getText_getAttribute {


    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer

        String expectedLabelText = "Remember me on this computer";
        String actualLabelText = driver.findElement(By.className("login-item-checkbox-label")).getText();

        if (actualLabelText.equals(expectedLabelText)) {

            System.out.println( "remember me text - Pass");
        } else System.out.println("Fail");


        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        String forgotPasswordtext = "FORGOT YOUR PASSWORD?";
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotPasswordtext = forgotPasswordLink.getText();
        if (actualForgotPasswordtext.equals(forgotPasswordtext)) {

            System.out.println(" Forgot Your password text - Passed");
        } else {
            System.out.println("actualForgotPasswordtext = " + actualForgotPasswordtext);
            System.out.println("forgotPasswordtext = " + forgotPasswordtext);
            System.out.println(" forgot Password Fail");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes


        String expectedInHref = "forgot_password=yes";
        String actualHrefValue = forgotPasswordLink.getAttribute("href");
        if (actualHrefValue.contains(expectedInHref)) {
            System.out.println("Href passed");
        } else {
            System.out.println("Href failed ");
        }
        driver.close();


    }
}
