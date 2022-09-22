package com.cydeo.tests.day2_locators_getRtext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM_T3_Title_google {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://google.com");

      // WebElement singButton = driver.findElement(By.className("gb_Ba"));
        //searchBox.sendKeys("wooden spoon" + Keys.ENTER);
    }
}
