package com.example;

import com.example.pages.PopupPage;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class PopupTest extends  BaseTest{
    private PopupPage demoPage;

    @Test
    public void alertTest() {
        demoPage = new PopupPage(driver);
        String customerId = "12545";
        String actualMsg =  demoPage.deleteCustomer(customerId,"yes");
        String expectedMsg = "Customer Successfully Delete!";
        assertEquals(actualMsg,expectedMsg);
    }
}
