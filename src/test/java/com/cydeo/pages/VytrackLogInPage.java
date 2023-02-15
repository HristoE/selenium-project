package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLogInPage {


    public VytrackLogInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//input[@id= 'prependedInput']")
    public WebElement userNameText;

    @FindBy ( xpath = "//input[@id='prependedInput2']")
    public WebElement txt_password;

    @FindBy(id= "_submit")
    public WebElement btn_login;

    public void login(){

    }
}
