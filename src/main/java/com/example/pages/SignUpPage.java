package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//input[@id='fa-firstname']")
    private WebElement firstNameInput;

    @FindBy(id = "fa-lasttname")
    private WebElement lastNameInput;

    @FindBy(id = "fa-username")
    private WebElement usernameInput;

    @FindBy(id = "fa-email")
    private WebElement emailInput;

    @FindBy(id = "fa-password")
    private WebElement passwordInput;

    @FindBy(linkText ="Sign Up")
    private WebElement signuUpButton;

    private String url = ApplicationProperties.INSTANCE.getBaseUrl() + "sign-up/step-2/";

    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get(url);
    }

    public void signUp(String firstname, String lastname , String username, String email, String password) {
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        usernameInput.sendKeys(username);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signuUpButton.click();
    }
}
