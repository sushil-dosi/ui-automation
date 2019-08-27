package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class ContactUsPage extends BasePage {


    @FindBy(id = "support-contactus")
    private WebElement contact;

    @FindBy()


    public ContactUsPage(WebDriver driver) {
        super(driver);
    }


}