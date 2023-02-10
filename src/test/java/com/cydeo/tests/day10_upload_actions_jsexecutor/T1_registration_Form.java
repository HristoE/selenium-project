package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_registration_Form {

    @Test

    public void registation_form() {


        // TC#1: Registration form confirmation
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        // 3. Enter first name
        WebElement inputFirtsName = Driver.getDriver().findElement(By.xpath("//input[@name= 'firstname']"));
        inputFirtsName.sendKeys("Jane");
        //4. Enter last name
        WebElement inputLastname = Driver.getDriver().findElement(By.xpath("//input[@name= 'lastname']"));
        inputLastname.sendKeys("DOE");
        //5. Enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name= 'username']"));
        inputUsername.sendKeys("janedoe43");
        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name= 'email']"));
        inputEmail.sendKeys("janedoe43@gmail.com");
        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name= 'password']"));
        inputPassword.sendKeys("jane43jane34doe");
        //8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name= 'phone']"));
        inputPhoneNumber.sendKeys("703-321-7040");
        //9. Select a gender from radio buttons
        WebElement radioButtonFemale = Driver.getDriver().findElement(By.xpath("//input[@value = 'female']"));
        radioButtonFemale.click();

        //10.Enter date of birth
        WebElement inputDateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name = 'birthday']"));
        inputDateOfBirth.sendKeys("11/11/2010");

        //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name= 'department']")));
        departmentDropdown.selectByVisibleText("Department of Engineering");
        //12.Select Job Title
        Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name= 'job_title']")));
        jobTitleDropdown.selectByVisibleText("SDET");

        //13.Select programming language from checkboxes
        WebElement javaCheckBox = Driver.getDriver().findElement(By.xpath("//input[@value= 'java']"));
        javaCheckBox.click();

        //14.Click to sign up button
        WebElement signUpButton = Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUpButton.click();


        //15. Verify success message “You’ve successfully completed registration.” is displayed.

WebElement sucessMSG = Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));
        Assert.assertTrue(sucessMSG.isDisplayed());

        Driver.closeDriver();

    }


}
