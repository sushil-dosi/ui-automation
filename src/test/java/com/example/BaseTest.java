package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected WebDriver driver;


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Start");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
        driver = new ChromeDriver();



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
