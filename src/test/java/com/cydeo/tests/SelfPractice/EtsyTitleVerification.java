package com.cydeo.tests.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // 2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        // 3. Search for “wooden spoon”
        // 4. Verify title:
        //Expected: “Wooden spoon - Etsy”


        WebElement etsySearchBox  = driver.findElement(By.name("search_query"));
        Thread.sleep(3000);
        //  woodenSpoon.click();
        etsySearchBox.sendKeys(" wooden spoon" + Keys.ENTER);

     String expectedTitle = "Wooden spoon - Etsy ";
     String  actualtitle = driver.getTitle();

     if ( actualtitle.equals(expectedTitle)){
         System.out.println("Passed");
     }
        System.out.println(" fail ");

        System.out.println(driver.getTitle());
     driver.close();





    }

}
