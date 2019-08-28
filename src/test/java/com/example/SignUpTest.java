package com.example;

import com.example.pages.LoginPage;
import com.example.pages.SignUpPage;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SignUpTest extends BaseTest{

    private SignUpPage signUpPage;

    @Test
    public void signUpTest() throws InterruptedException {
        signUpPage = new SignUpPage(driver);
        signUpPage.selectFreePlan();
        String actualStep2Url = driver.getCurrentUrl();
        String step2Url = actualStep2Url.substring(0,actualStep2Url.indexOf("?"));
        assertThat(step2Url,equalTo("https://www.website.com/sign-up/step-2/"));

        String firstName= "test";
        String lastName = "user";
        String username= "testuser";
        String email= "test@user.com";
        String password = "Dummy1234";

        signUpPage = new SignUpPage(driver,actualStep2Url);
        signUpPage.signUpStep2(firstName,lastName,username,email,password);
        Thread.sleep(3000l);
        String actualStep3Url = driver.getCurrentUrl();
        String step3Url = actualStep3Url.substring(0,actualStep3Url.indexOf("?"));
        assertThat(step3Url,equalTo("https://www.website.com/sign-up/step-2/"));



    }
}
