package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {


    @Test

    public void test1(){
        //create java faker object

        Faker faker = new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        // numefiry method is used to genarate with specific formating

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

    }
}
