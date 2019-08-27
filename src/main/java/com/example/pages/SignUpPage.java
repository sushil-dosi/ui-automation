package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage{

@FindBy(id= "menuSignup")
 private WebElement signup;
@FindBy(xpath= "//*[@id=‘P4’]")
 private WebElement selectbtn;
@FindBy(id= "fa-firstname")
private WebElement firstn;
@FindBy(id= "fa-lastname")
private WebElement lastn;
@FindBy(id= "fa-email" )
private WebElement mail;
@FindBy(id= "fa-username")
private WebElement uname;
@FindBy(id = "fa-password")
private WebElement pword;
@FindBy(xpath= "//*[@class= 'ladda-label']")
private WebElement signu;


    public SignUpPage(WebDriver driver) {
        super(driver);

        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get("url");

    }


    public void signUpPage(String firstname, String lastname, String email, String username, String password) {

        firstn.sendKeys(firstname);
        lastn.sendKeys(lastname);
        mail.sendKeys(email);
        uname.sendKeys(username);
        pword.sendKeys(password);
        signu.click();
    }

}
