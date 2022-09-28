package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_getText_cssSelector_Practice {

    public static void main(String[] args) {

       WebDriver driver =  WebDriverFactory.getDriver("chrome");

       driver.manage().window().maximize();

       driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

       WebElement resetPasswordBtn = driver.findElement(By.cssSelector("button.login-btn"));

        String expected = "Reset password";
        String actual = resetPasswordBtn.getText();

        if(actual.equals(expected)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.quit();
    }
}
