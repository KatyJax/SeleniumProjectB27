package com.cydeo.tests.day4_xpath_cssSelector;

import com.cydeo.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_checkBoxes {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.get("https://practice.cydeo.com/checkboxes");


        WebElement checkboxes1 = driver.findElement(By.id("box1"));

        WebElement checkboxes2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));


        System.out.println("checkboxes1.isSelected(), expecting false " + checkboxes1.isSelected());
        System.out.println("checkboxes2.isSelected(), expecting true " + checkboxes2.isSelected());

        checkboxes1.click();
        checkboxes2.click();

        System.out.println("checkboxes1.isSelected(), expecting true " + checkboxes1.isSelected());
        System.out.println("checkboxes2.isSelected(), expecting false " + checkboxes2.isSelected());
    }
}
