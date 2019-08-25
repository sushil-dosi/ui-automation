package com.example.pages;

import com.example.utils.ApplicationProperties;
import javafx.application.Application;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}
