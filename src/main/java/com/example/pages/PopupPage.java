package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPage extends BasePage {

    @FindBy(name = "cusid")
    private WebElement customerIdInput;

    @FindBy(name = "submit")
    private WebElement submitBtn;

    private String url = "http://demo.guru99.com/test/delete_customer.php";

    public PopupPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get(url);
    }

    public String deleteCustomer(String customerId, String isDelete) {
        customerIdInput.sendKeys(customerId);
        submitBtn.click();
        Alert alert = driver.switchTo().alert();
        String alertMsg = alert.getText();
        System.out.println(alertMsg);

        if (isDelete.equalsIgnoreCase("yes")){
            alert.accept();
        }else {
            alert.dismiss();
        }
        Alert deletedAlert = driver.switchTo().alert();
        System.out.println(deletedAlert.getText());
        String deleteSuccessMsg = deletedAlert.getText();
        deletedAlert.accept();
        return deleteSuccessMsg;
    }
}
