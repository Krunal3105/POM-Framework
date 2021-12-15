package com.nopcommerce.pages.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    By register = By.className("ico-register");
    By genderMale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By DOBDate = By.name("DateOfBirthDay");
    By DOBMonth = By.name("DateOfBirthMonth");
    By DOBYear = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By companyName = By.id("Company");
    By newsLetter = By.name("Newsletter");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;}

    public String getPageTitle()throws InterruptedException{
        String rpTitle = driver.getTitle();
        Thread.sleep(2000);
        System.out.println("Register Page Title Is" + rpTitle);
        return rpTitle;
    }

    public void doRegister(String Firstname,String Lastname,String Day,String Month,String Year,String email,
                           String Password,String Confirmpassword,String CompanyName)throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(register).click();
        Thread.sleep(1000);
        driver.findElement(genderMale).click();
        Thread.sleep(1000);
        driver.findElement(firstName).sendKeys(Firstname);
        driver.findElement(lastName).sendKeys(Lastname);
        Thread.sleep(1000);
        driver.findElement(DOBDate).sendKeys(Day);
        driver.findElement(DOBMonth).sendKeys(Month);
        driver.findElement(DOBYear).sendKeys(Year);
        Thread.sleep(1000);
        driver.findElement(Email).sendKeys(email);
        driver.findElement(companyName).sendKeys(CompanyName);
        driver.findElement(newsLetter).click();
        Thread.sleep(1000);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(confirmPassword).sendKeys(Confirmpassword);
        driver.findElement(registerButton).click();




    }




}

