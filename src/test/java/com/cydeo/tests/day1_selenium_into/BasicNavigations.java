package com.cydeo.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args)  throws InterruptedException{


        //1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();
        //session id = 72ABYIGHBN88


        //making window full screen/maximizing
        driver.manage().window().maximize();


        //3.  go to "https://www.tesla.com"
        //driver.get("https://www.tesla.com");

        // navigate().to() method is loading to url in browser
        driver.navigate().to("https://www.tesla.com");
        String currentTittle = driver.getTitle();
        System.out.println("currentTittle = " + currentTittle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        // stops execution  of code for 3 sec.
        Thread.sleep(3000);

        // navigate().back method will take previous page
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to("https:/www.google.com");
        currentTittle = driver.getTitle();
        System.out.println("currentTittle = " + currentTittle);

        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);






        // close() method will close current opened page
       // driver.close();

        // quit() method will close all opened pages
        driver.quit();

        //driver.get("https://www.google.com");








    }
}
