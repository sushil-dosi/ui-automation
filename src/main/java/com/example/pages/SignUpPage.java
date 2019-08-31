package com.example.pages;

import com.example.utils.ApplicationProperties;
import com.sun.org.apache.bcel.internal.generic.RET;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    @FindBy(id = "menuSignup")
    WebElement signupbutton;

    @FindBy(xpath = "//*[@id= 'P4']/div[1]/button")
     WebElement selectbutton;

    @FindBy(id="fa-firstname")
    private WebElement firstname;

    @FindBy(id = "fa-lastname")
    private WebElement lastname;

    @FindBy(id = "fa-email")
     private WebElement mail;

    @FindBy(id = "fa-username")
     private WebElement username;

    @FindBy(id = "fa-password")
    private WebElement password;

    @FindBy(xpath = "//*[@class= 'ladda-label']")
     private WebElement signup;

    private String url = ApplicationProperties.INSTANCE.getBaseUrl() + "sign-up/";

    public SignUpPage(WebDriver driver) {
        super(driver);

        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get(url);

    }


    public void clickSignUpButton() {
        signupbutton.click();

    }

    public void clickSelectButton() {
        selectbutton.click();

    }

    public void signup(String fname,String lname, String email,String uname,String pwd) {

        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        mail.sendKeys(email);
        username.sendKeys(uname);
        password.sendKeys(pwd);
        signup.click();

    }

}