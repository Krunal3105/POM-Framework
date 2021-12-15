package com.nopcommerce.test;

import com.nopcommerce.pages.base.BasePage;
import com.nopcommerce.pages.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterPageTest {
    BasePage basePage;
    // WebDriver driver;
    WebDriver driver;
    Properties prop;
    RegisterPage registerPage;

    @BeforeTest
    public void openBrowser() {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        // driver = basePage.initialiseDriver(webEngine);
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);
    }

    @Test(priority = 1)
    public void verifyRegisterPageTitleTest() throws InterruptedException {
        Assert.assertEquals(registerPage.getPageTitle(), "nopCommerce demo store", "Register page mismatch");
    }

    @Test(priority = 2)
    public void RegisterPageTest() throws InterruptedException {
        registerPage.doRegister(prop.getProperty("Firstname"), prop.getProperty("Lastname"), prop.getProperty("Day"), prop.getProperty("Month"),
                prop.getProperty("Year"), prop.getProperty("email"), prop.getProperty("Password"), prop.getProperty("Confirmpassword"),
                prop.getProperty("CompanyName"));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
