package com.cydeo.tests.review.week3;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;

public class CRM_SendingMessages extends TestBase {








    @Test
    public void sending_messages_test(){

        //       1. Users are already login and on the homepage
        driver.get(ConfigurationReader.getProperty("env"));
        // Login through utilities class
        CRM_Utilities.login_crm(driver);

        //       2. Users click the MESSAGE tab
        WebElement messageTab = driver.findElement(By.id("feed-add-post-form-tab-message"));
        messageTab.click();

        //       3. Users write test message
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        driver.findElement(By.tagName("body")).sendKeys(" Само Левски оле ");

        //       4. Users click the SEND button
        driver.switchTo().defaultContent();
        WebElement sendBtn = driver.findElement(By.id("blog-submit-button-save"));

        //       5. Verify the message is displayed on the feed

WebElement feed = driver.findElement(By.xpath("//div[starts-with(@id,'blog_post_body')]"));
String actual = feed.getText();
String expected = "Само Левски оле";
        Assert.assertTrue(actual.contains(expected)," Failing the test");


    }
}
