package com.example;
import com.example.pages.BasePage;
import com.example.pages.LoginPage;
import com.example.pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SignUpTest extends BaseTest {

    private SignUpPage SignUpPage;


    @Test
    public void signUpTest() {

        String fname=  "Pankaj";
        String lname=  "QA";
        String email=  "test@gmail.com";
        String uname=  "Tester7";
        String pwd=    "lise1234";

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.clickSignUpButton();
        signUpPage.clickSelectButton();
        System.out.println("--------" + driver.getCurrentUrl());

        signUpPage.signup(fname,lname,email,uname,pwd);


        assertThat(driver.getCurrentUrl(),equalTo("https://www.website.com/sign-up/"));
        }
    }

