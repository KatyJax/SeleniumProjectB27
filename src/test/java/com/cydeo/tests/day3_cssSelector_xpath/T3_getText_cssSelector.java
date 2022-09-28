package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T3_getText_cssSelector {
    public static void main(String[] args) {

        //1 open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2 go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3 Verify "Log in" button text is as expected: Log In

        // Locate with using cssSelector by type attribute:
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        // Locate with using cssSelector by value attribute:
       // WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));

        // Locate with using cssSelector by class attribute:
       // WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));

        // Locate with using cssSelector by class attribute: with Syntax #2
       // WebElement logInBtn = driver.findElement(By.cssSelector("input.login-btn"));

        // Locate with using cssSelector by oncLink attribute:
       // WebElement logInBtn = driver.findElement(By.cssSelector("input[oncLink=\"BX.addClass(this, 'wait');\"]"));


    }
}
