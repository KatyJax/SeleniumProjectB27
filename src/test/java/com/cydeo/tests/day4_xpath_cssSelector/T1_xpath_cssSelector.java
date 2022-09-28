package com.cydeo.tests.day4_xpath_cssSelector;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector {
    public static void main(String[] args) {

        WebDriver driver =  WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");


        WebElement homeLink1 = driver.findElement(By.cssSelector("a.nav-link"));

        //WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement homeLink3 = driver.findElement(By.xpath("//a[@class='nav-link']"));




     //   WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));

     //   WebElement forgotPassword2 = driver.findElement(By.cssSelector("div[class='example']>h2"));

     //   WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement forgotPassword31 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        WebElement forPass = driver.findElement(By.xpath("//div[@class='example']/h2"));

        WebElement emailText1 = driver.findElement(By.xpath("//label[.='E-mail']"));

        WebElement emailText2 = driver.findElement(By.xpath("//label[contains(@for,'email')]"));


        WebElement emailInput = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']>i"));


       // WebElement poweredBuCydeo = driver.findElement(By.cssSelector("//div[@style='text-align: center;']"));

        System.out.println("homeLink1.isDisplayed = " + homeLink1.isDisplayed());
        System.out.println("forgotPassword31.isDisplayed() = " + forgotPassword31.isDisplayed());
        System.out.println("emailText1.isDisplayed() = " + emailText1.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());


    }
}
