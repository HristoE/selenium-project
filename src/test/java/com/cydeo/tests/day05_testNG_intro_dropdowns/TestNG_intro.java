package com.cydeo.tests.day05_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_intro {


    @BeforeClass
    public void setupClass(){
        System.out.println("Before classo is running ");
    }

    @AfterClass

    public void tearDownClss(){
        System.out.println(" -->>  After Class is running ");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println(" --> before method is running....");
    }



    @Test ( priority = 2)
    public void test1(){

        System.out.println("Test 1 is running" );
    }
    @Test ( priority = 1 )
    public void test2 (){
        System.out.println("test 2 is running");

        Assert.assertEquals("apple ", "apple");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println(" --> after method is running ");
    }


}
