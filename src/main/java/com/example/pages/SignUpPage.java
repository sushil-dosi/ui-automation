package com.example.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage

{
    @FindBy(id = "menuSignup")
    private WebElement menuSign;
    @FindBy()


    @FindBy(id = "fa-firstname")
    private WebElement firstname;

    @FindBy(id = "fa-lastname")
    private WebElement lastname;
    @FindBy(id = "fa-email")
    private WebElement email;
    @FindBy(id = "fa-username")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id= "ladda-label")
    private WebElement SignUpButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

        public void signUpPage (String firstname, String lastname, String email, String username, String password){
            firstname.sendKeys(firstname);
            lastname.sendKeys((CharSequence) lastname);
            email.sendKeys((CharSequence) email);
            username.sendKeys((CharSequence) username);
            password.sendKeys((CharSequence) password);
            SignUpButton.click();
        }
    }

