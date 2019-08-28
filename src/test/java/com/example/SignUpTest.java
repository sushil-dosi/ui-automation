package com.example;

import com.example.pages.BasePage;
import com.example.pages.LoginPage;
import com.example.pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignUpTest extends BasePage {

    private SignUpPage SignUpPage;

    public SignUpTest(WebDriver driver) {
        super(driver);
    }

    @Test
        public void SignUpTest()
        {
            String firstname = "Test";
            String lastname = "QA";
            String email = "Test123@gmail.com";
            String username = "Lise";
            String password = "Test@1234";
            SignUpPage Signup = new SignUpPage(driver);
            Signup.signUpPage(firstname, lastname, email, username, password);

        }
    }

