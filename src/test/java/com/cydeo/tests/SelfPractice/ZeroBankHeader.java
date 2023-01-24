package com.cydeo.tests.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeader {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedHeader= "Log in to ZeroBank";

        String actualHeaderName = driver.findElement(By.tagName("h3")).getText();
        if (actualHeaderName.equals("Log in to ZeroBank")){
            System.out.println("Header verification passed");
        } else System.out.println("Fail");



driver.close();
    }
}
