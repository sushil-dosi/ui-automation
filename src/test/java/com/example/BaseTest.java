package com.example;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.URL;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Start");
    }

//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("before test");
//        String driverPath = ApplicationProperties.INSTANCE.getDriverPath();
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        driver = new ChromeDriver();
//    }

    @BeforeTest
    public void runWithSauceLabs() throws Exception{
        String sauceUserName = "atishaysharma";
        String sauceAccessKey = "a747e449-d764-4de7-a177-d7f7dc5dae72";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", sauceUserName);
        capabilities.setCapability("accessKey", sauceAccessKey);
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("version", "59.0");
        capabilities.setCapability("name", "My_first_saucelabs_test");
        driver = new RemoteWebDriver(new URL("http://ondemand.saucelabs.com:80/wd/hub"), capabilities);
    }

    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("End");
    }
}
