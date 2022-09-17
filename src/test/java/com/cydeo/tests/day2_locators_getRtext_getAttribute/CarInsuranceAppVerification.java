package com.cydeo.tests.day2_locators_getRtext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsuranceAppVerification {

    public static void main(String[] args) {


        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2. go to https://www.qa1.excelsoirinsurance.com/login
        driver.get("https://www.qa1.excelsoirinsurance.com/login");


        //3. Verify URL contains Expected: excelsoirinsurance
        String expectedURL = "excelsoirinsurance";
        String actualURA = driver.getCurrentUrl();
        // if(driver.getCurrentUrl().contains("excelsoirinsurance")); // don't do like that


        if(actualURA.contains(expectedURL)){
            System.out.println("URL verivication is PASSED");
        }else {
            System.out.println("URL is FAILED");
        }


        //4. Vrigy
        String expecedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();


        if(actualTitle.equals(expecedTitle)){
            System.out.println("Title verification is PASSED");
        }else {
            System.out.println("Title verification is FAILED");
        }

        driver.quit();
    }
}
