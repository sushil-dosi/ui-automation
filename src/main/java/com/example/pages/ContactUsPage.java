package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {

    @FindBy(xpath = "//*[@id='support-contactus']")
    private WebElement contactusButton;

    @FindBy(xpath = "//*[@id= 'start-case']/div[2]/a")
    private WebElement startButton;
    @FindBy(xpath = "//*[@id= 'ContactUsForm']/table/tbody/tr[3]/td[3]/input")
    private WebElement yname;
    @FindBy(xpath = "/*[@id= 'ContactUsForm']/table/tbody/tr[4]/td[3]/input")
    private WebElement yemail;
    @FindBy(xpath = "//*[@id='ContactUsForm']/table/tbody/tr[5]/td[3]/input")
    private WebElement sub;
    @FindBy(xpath = "//*[@id='ContactUsForm'']/table/tbody/tr[7]/td/div/table/tbody/tr[2]/td[3]/input")
    private WebDriver address;
    @FindBy(xpath = "//*[@id= 'ContactUsForm']/table/tbody/tr[7]/td/div/table/tbody/tr[3]/td[3]/input")
    private WebDriver usern;
    @FindBy(xpath = "//*[@id='ContactUsForm']/table/tbody/tr[7]/td/div/table/tbody/tr[4]/td[3]/input")
    private WebElement pwd;
    @FindBy(xpath = "//*[@id= ContactUsForm']/table/tbody/tr[9]/td/textarea")
    private WebElement message;
    @FindBy(xpath = "//*[@id='ContactUsForm']/table/tbody/tr[10]/td/div/button")
    private WebElement submit;
    @FindBy(xpath = "//*[@id='ContactUsForm']/table/tbody/tr[10]/td/div/a")
    private WebElement cancel;

    private String url = ApplicationProperties.INSTANCE.getBaseUrl() + "sign-in/";

    public ContactUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get("url");
    }

    public void ContactUsPage(String name, String email, String subject, String website, String username, String password, String message) {

        contactusButton.click();
        startButton.click();
        yname.sendKeys(name);
        yemail.sendKeys(email);
        sub.sendKeys(subject);
        cancel.click();

    }
}