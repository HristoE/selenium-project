package com.cydeo.tests.day09_review_javafaker_driverUtil;

public class Singleton {

    //1 Create private constructor
    private Singleton(){}

    //2 Private static string
    private static String word;
    //3 Utility method to return teh private String we just created
    public static String getWord(){
        if( word == null ){
            System.out.println("First time call .Word object is null ");
            System.out.println( "Assigning value to it now ");
            word = "somethingh";
        }else {
            System.out.println( "Word alredy has a value ");
        }
        return word;
    }




}
