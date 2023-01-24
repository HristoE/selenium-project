package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://practice.cydeo.com");

        driver.manage().window().maximize();
        String expectedInURL= "cydeo";
        String actualURL = driver.getCurrentUrl();
        if ( actualURL.contains(expectedInURL)){ // use contails method to check if cydeo is part of the whole url

            System.out.println("URL verification PASS");
        }else System.out.println("URL verification FAIL ");


        String expectedTitle ="Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){// checking if the actual title equlas the expected
            System.out.println("Tittle verification is PASS ");
        }else System.out.println("Tittle verification  FAIL  ");







driver.close();









        /*
        TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
         */


    }
}
