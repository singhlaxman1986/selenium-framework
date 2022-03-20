package com.org.reg1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {

    public static void main(String[] args) {



    WebDriver driver;


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); 
       // driver.quit();

        // Exercise
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();

        // Verify
       // assertThat(title).contains("Selenium WebDriver");
    }
}






