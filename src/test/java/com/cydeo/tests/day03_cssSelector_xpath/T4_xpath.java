package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_xpath {
    public static void main(String[] args) {
        // TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        String expectedLoginText = "Log In";
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        String actualLoginText = loginButton.getAttribute("value");
        if(actualLoginText.equals(expectedLoginText)){
            System.out.println("Login Passsed");
        }else System.out.println("Login Fail");


        //WebElement loginButton=driver.findElement(By.className("login-btn")); - old version
    }
}
