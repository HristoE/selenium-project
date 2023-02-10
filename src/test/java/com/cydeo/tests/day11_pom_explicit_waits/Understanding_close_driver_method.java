package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class Understanding_close_driver_method {

    @Test
    public  void test1 (){

        Driver.getDriver().get("https://www.google.com/");
    }


}
