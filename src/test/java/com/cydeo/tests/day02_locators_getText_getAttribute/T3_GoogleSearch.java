package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://google.com");
        WebElement googleSearchBox = driver.findElement(By.name("q"));//locate the search box by inspecting the page and find name
        googleSearchBox.sendKeys("apple" + Keys.ENTER);
        //googleSearchBox.sendKeys(Keys.ENTER); // to press Enter, same as above


        String expectedBeginingOfTitle = "apple";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedBeginingOfTitle)) {
            System.out.println("Title verification Pass");
        } else System.out.println("Title Verification Fail ");


        driver.close();
    }

}
/*
TC#3: Google search
1- Open a Chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press ENTER to search
5- Verify title:
Expected: Title should start with “apple” word
 */