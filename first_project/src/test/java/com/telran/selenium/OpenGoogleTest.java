package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {
    WebDriver driver;
    @Test
    public void setUp() throws InterruptedException {
        driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("csi")).sendKeys("java");
        Thread.sleep(7000);
        driver.quit();
    }

}
