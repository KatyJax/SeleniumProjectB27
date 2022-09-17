package com.cydeo.tests.day2_locators_getRtext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");


        //3. verify header text is as expected Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header text verification PASSED");
        }else {
            System.out.println("Header text verification FAILED");
        }

        //4. Locate "first name" input box
        WebElement firstNameInput = driver.findElement(By.name("firstname"));


        //5. Verify placeHolder attribute's value is as expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if(actualHeader.equals(expectedHeader)){
            System.out.println("PlaceHolder text verification PASSED");
        }else {
            System.out.println("PlaceHolder text verification FAILED");
        }


        driver.quit();



    }
}
