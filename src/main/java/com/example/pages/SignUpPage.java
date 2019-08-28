package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"fa-firstname\"]")
    private WebElement firstNameInput;

    @FindBy(xpath = "//*[@id=\"fa-lastname\"]")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id=\"fa-username\"]")
    private WebElement usernameInput;

    @FindBy(xpath = "//*[@id=\"fa-email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"fa-password\"]")
    private WebElement passwordInput;

    @FindBy(xpath ="/html/body/div[1]/div[3]/div[2]/div[1]/div[1]/form/ul/li[6]/button/span[1]")
    private WebElement signuUpButton;

    @FindBy(xpath ="/html/body/div[2]/div[3]/div[3]/form/div/div[1]/div[1]/button")
    private WebElement freePlanButton;

    @FindBy(xpath ="/html/body/div[2]/div[3]/div[3]/form/div/div[2]/div[2]/button")
    private WebElement personalPlanButton;

    @FindBy(xpath ="/html/body/div[2]/div[3]/div[3]/form/div/div[3]/div[3]/button")
    private WebElement businesslanButton;

    @FindBy(xpath ="/html/body/div[2]/div[3]/div[3]/form/div/div[4]/div[4]/button")
    private WebElement ecommercePlanButton;

    private String url = ApplicationProperties.INSTANCE.getBaseUrl() + "sign-up";

    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get(url);
    }

    public SignUpPage(WebDriver driver,String url) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get(url);
    }

    public void signUpStep2(String firstname, String lastname , String username, String email, String password) {
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        usernameInput.sendKeys(username);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signuUpButton.click();
    }

    public void selectFreePlan() {
        freePlanButton.click();
    }
}
