package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {


        //1 Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2 go to
        driver.get("https://login1.nextbasecrm.com/");

        //3 Verifi "remember me". Expected: "Remember me on this computer"
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)) {
            System.out.println("Remember me label text verification PASSED");
        } else {
            System.out.println("Remember me label text verification FAILED");
        }

        //4  Verify "forgot password" link text is as expected:   Expected: FORGOT YOUR PASSWORD?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLink = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLink = forgotPasswordLink.getText();

        if (actualForgotPasswordLink.equals(expectedForgotPasswordLink)) {
            System.out.println("Forgot password link text verification PASSED");
        } else {
            System.out.println("actualForgotPasswordLink " + "=" + actualForgotPasswordLink);
            System.out.println("expectedForgotPasswordLink " + "=" + expectedForgotPasswordLink);
            System.out.println("Forgot password link text verification FAILED");
        }


        //5  Verify "forgot password" href attribute's value contains expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPasswordLink.getAttribute("href");


        if (actualInHref.contains(expectedInHref)) {
        System.out.println("Href attribute value verification PASSED");
    }else {
            System.out.println("Href attribute value verification FAILED");
        }


        driver.quit();

    }
}
