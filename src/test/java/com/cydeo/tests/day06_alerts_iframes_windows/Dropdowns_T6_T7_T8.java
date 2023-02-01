package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dropdowns_T6_T7_T8 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }



    @Test
    public void dropdown_task6() {
        //TC #6: Selecting date on dropdown and verifying
        // 3. Select “December 1st, 1933” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id= 'year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id= 'month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        //Select year using : visible text
        yearDropdown.selectByVisibleText("1933");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);

        // Select month using : value attribute
        String expectedYear = "1933";
        String expectedMonth = "December";
        String expectedDay = "1";
        //Select day using : index number


        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //Assurtions

        Assert.assertEquals(actualYear, expectedYear);
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);
    }


    @Test
    public void dropdown_T7() {
 //Locate the dropdown and create selct object

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id= 'state']")));
    //TC #7: Selecting state from State dropdown and verifying result
stateDropdown.selectByVisibleText("Illinois");
    //3. Select Illinois
        stateDropdown.selectByVisibleText("Illinois");
    //4. Select Virginia
        stateDropdown.selectByValue("VA");
    //5. Select California
        stateDropdown.selectByIndex(5);

    //6. Verify final selected option is California.


    //Use all Select options. (visible text, value, index
    String expecteOptionText = "California";
    String actualOptionText = stateDropdown.getFirstSelectedOption().getText();
    Assert.assertEquals(actualOptionText, expecteOptionText,"STATE DROPDOWN VALUE IS NOT AS EXPECTED !");


}

@Test
public void dropDown_T8(){


    //TC #8: Selecting value from non-select dropdown
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown

    WebElement webSiteDropdown= driver.findElement(By.id("dropdownMenuLink"));

    //3. Click to non-select dropdown
    webSiteDropdown.click();

   // 4. Select Facebook from dropdown;
    WebElement faceBookLink= driver.findElement(By.linkText("Facebook"));
    faceBookLink.click();
    //5. Verify title is “Facebook - Log In or sign Up”
    String expectedTitle= "Facebook – log in or sign up";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle," Title not matching ");



}











@AfterMethod
    public void tearDownMethod(){
        driver.quit();
}
}
