package com.example;
import com.example.pages.BasePage;
import com.example.pages.ContactUsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ContactUsTest extends BaseTest {

    private ContactUsPage ContactUsPage;

    @Test
    public void contactUsTest(){

        ContactUsPage contactUsPage= new ContactUsPage(driver);
        contactUsPage.clickContactButton();
        contactUsPage.clickstartButton();

        String sname=  "Pankaj QA";
        String semail= "liseinfotech.com";
        String sub=    "Test";
        String dname=  "listech";
        String uid=    "Testid";
        String upwd=   "ABC@1123";
        String msg=    "Test message";

        contactUsPage.newcase(sname, semail, sub, dname, uid, upwd, msg );

        assertThat(driver.getCurrentUrl(),equalTo("https://www.website.com/case-tracker/new-case/"));
    }

}
