package com.cydeo.tests.day08_properties_config_reader;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {


    @Test

    public void reading_from_properties_test() throws IOException {
//Stepts to read from properties type of file
        // create object of properties
        Properties properties = new Properties();


        // open the file in Java Memory using FileInputStream

        FileInputStream file = new FileInputStream("configuration.properties");

        // load the properties file in Properties object
        properties.load(file);
        //use the property object
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));
    }
}
