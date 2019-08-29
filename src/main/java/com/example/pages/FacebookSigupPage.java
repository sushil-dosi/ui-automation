package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookSigupPage extends  BasePage {

    @FindBy(id = "u_0_l")
    private WebElement firstnameInput;

    @FindBy(id = "u_0_n")
    private WebElement surnameInput;

    @FindBy(id = "u_0_q")
    private WebElement mobileNoInput;

    @FindBy(id = "u_0_x")
    private WebElement passwordInput;

    @FindBy(id = "day")
    private WebElement daySelect;

    @FindBy(id = "month")
    private WebElement monthSelect;

    @FindBy(id = "year")
    private WebElement yearSelect;

    @FindBy(id = "u_0_8")
    private WebElement femaleRadioBtn;

    @FindBy(id = "u_0_9")
    private WebElement maleRadioBtn;

    @FindBy(id = "u_0_15")
    private WebElement signupBtn;



    private String url = ApplicationProperties.INSTANCE.getFacebookBaseUrl();

    public FacebookSigupPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get(url);
    }

    public void signup(String firstname, String surname , String mobileNo ,String password , String day , String month, String year , String gender ) throws InterruptedException {
        firstnameInput.sendKeys(firstname);
        surnameInput.sendKeys(surname);
        mobileNoInput.sendKeys(mobileNo);
        passwordInput.sendKeys(password);


        Select dayDropDown = new Select(daySelect);
        dayDropDown.selectByValue(day);

        Select monthDropDown = new Select(monthSelect);
        monthDropDown.selectByValue(month);

        Select yearDropDown = new Select(yearSelect);
        yearDropDown.selectByValue(year);

        switch (gender){
            case "F":
                femaleRadioBtn.click();
            case "M":
                maleRadioBtn.click();
            default:
                maleRadioBtn.click();
        }
        signupBtn.click();
    }
}
