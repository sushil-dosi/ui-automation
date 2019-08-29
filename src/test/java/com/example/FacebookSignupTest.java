package com.example;

import com.example.pages.FacebookSigupPage;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FacebookSignupTest extends  BaseTest{

    private FacebookSigupPage facebookSigupPage;
    @Test
    public void loginTest() throws InterruptedException {
        String firstname= "john";
        String surname= "carlo";
        String mobileNo= "9981123456";
        String password = "Dummy1234";
        String gender= "F";
        String day= "10";
        String month= "11";
        String year= "1990";

        facebookSigupPage = new FacebookSigupPage(driver);
        facebookSigupPage.signup(firstname,surname,mobileNo,password,day,month,year,gender);

        System.out.println("driver " + driver.getCurrentUrl());
    }
}
