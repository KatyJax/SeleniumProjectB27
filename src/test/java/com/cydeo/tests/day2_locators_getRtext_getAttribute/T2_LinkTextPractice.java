package com.cydeo.tests.day2_locators_getRtext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException{


        //1. Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. go to https://practice.cydeo
        driver.get("https://practice.cydeo.com");


        Thread.sleep(3000);

        //3. Click to A/B Testing from top of the list.
        WebElement abTestLink = driver.findElement(By.partialLinkText("A/B"));
        abTestLink.click();




        //4. Verify title is Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("No A/B/ Test title verification passed");
        }else {
            System.out.println("No A/B title verification failed");
        }

        //5. Co back to home page by using the  .back();
        driver.navigate().back();

        //6. Verify Title equals: Expected: Practice
        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Practice title verification PASSED");
        }else {
            System.out.println("Practice title verification FAILED");
        }


        Thread.sleep(3000);
        driver.quit();
    }
}


