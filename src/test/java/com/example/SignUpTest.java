package com.example;

import com.example.pages.LoginPage;
import com.example.pages.SignUpPage;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SignUpTest extends BaseTest{

    private SignUpPage signUpPage;

    @Test
    public void signUpTest() {
        String firstName= "test";
        String lastName = "user";
        String username= "testuser";
        String email= "test@user.com";
        String password = "Dummy1234";

        signUpPage = new SignUpPage(driver);
        signUpPage.signUp(firstName , lastName , username ,email ,password);

        assertThat(driver.getCurrentUrl(),equalTo("https://www.website.com/sign-up/step-3/"));
    }
}
