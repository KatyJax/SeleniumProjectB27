package com.cydeo.tests.day4_xpath_cssSelector;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_FindElement {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> allLinks =driver.findElements(By.tagName("a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement eachLink : allLinks) {
            System.out.println("Text of all links" + eachLink.getText());
            System.out.println("eachLink.getAttribute(\"href\") = " + eachLink.getAttribute("href"));
        }

    }
}
