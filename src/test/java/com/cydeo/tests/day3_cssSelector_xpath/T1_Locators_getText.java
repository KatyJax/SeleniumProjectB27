package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText {
    public T1_Locators_getText() {
    }

    public static void main(String[] args) {

        //1 Open a chrome browser
        //WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("safari");

        driver.manage().window().maximize();

        //2 Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3 Enter incorrect username: "incorrect"
       // driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("incorrect");


        //4 Enter incorrect password: "incorrect"
        WebElement inputUserPassword = driver.findElement(By.name("USER_PASSWORD")); // Mac: option + enter    // windows: all + enter
        inputUserPassword.sendKeys("incorrect");



        //5 Click to login button
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();


        //6  Verify error message text is as expected:
        // Expected: Incorrect login or password

        WebElement errorMsg = driver.findElement(By.className("errortext"));

        String expectedErrorVsg = "Incorrect login or password";
        String actualErrorVsg = errorMsg.getText();

        if (actualErrorVsg.equals(expectedErrorVsg)){
            System.out.println("Error message verification PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.quit();
    }
}
