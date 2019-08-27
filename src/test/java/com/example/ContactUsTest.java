package com.example;

import com.example.pages.BasePage;
import com.example.pages.ContactUsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ContactUsTest extends BaseTest {

    private ContactUsPage ContactUsPage;

    @Test
    public void contactUsTest(){

        String name= "Test1";
        String email= "Test123@tmail.com";
        String subject= "Test Demo";

        assertThat(driver.getCurrentUrl(),equalTo("https://www.website.com/contact-us/"));
    }

}
