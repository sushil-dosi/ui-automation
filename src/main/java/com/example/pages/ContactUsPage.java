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

    @FindBy( name="SenderName")
    private WebElement sendername;

    @FindBy(name= "SenderEmail")
    private WebElement  senderemail;

    @FindBy(name= "Subject")
    private WebElement subject;

    @FindBy(name= "DomainName")
    private WebElement domainname;

    @FindBy(name="UserID")
    WebElement userid;

    @FindBy(name="Password")
    private WebElement password;

    @FindBy(name= "Message")
    private WebElement message;

    @FindBy(xpath = "//*input[@type='submit']")
    private WebElement submit;

    @FindBy(xpath= "//* a[@href ='/contact-us/']")
    private WebElement cancel;

    private String url = ApplicationProperties.INSTANCE.getBaseUrl() + "contact-us/";

    public ContactUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get(url);
    }

    public void  clickContactButton() {
        contactusButton.click();

    }

    public void clickstartButton() {
        startButton.click();
    }


    public void newcase(String sname, String semail, String sub, String dname, String uid, String upwd, String msg ){

        sendername.sendKeys(sname);
        senderemail.sendKeys(semail);
        subject.sendKeys(sub);
        domainname.sendKeys(dname);
        userid.sendKeys(uid);
        password.sendKeys(upwd);
        message.sendKeys(msg);
        submit.click();

    }

}