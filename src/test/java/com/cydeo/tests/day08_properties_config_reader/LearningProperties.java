package com.cydeo.tests.day08_properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {
    @Test
    
    
    //Java is tracking our comp and project, user name and etc
    // here is how to print it out 
    public void java_properties_reading_test(){
        
        // MAP format /key-value/.key is os.name 
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }
}
