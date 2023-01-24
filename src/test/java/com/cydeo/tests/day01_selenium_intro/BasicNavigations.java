package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {


        // Setup browser  driver
        WebDriverManager.chromedriver().setup();
        //Create instance of Chrome browser
        WebDriver driver = new ChromeDriver();
        //Go to tesla.com

        driver.get("https://www.tesla.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        driver.manage().window().maximize();
        // Use navigate back() to go back


        driver.navigate().back();
        // Stop for few sec
        Thread.sleep(1000);


        // navigate forward
        driver.navigate().forward();

        Thread.sleep(1000);

        // User navigate refresh
        driver.navigate().refresh();
        Thread.sleep(1000);
        // Navigate to google.com using navigate().
        driver.navigate().to("https://www.google.com");
        Thread.sleep(1000);

          // get title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        driver.close();

        driver.quit();


    }
}
