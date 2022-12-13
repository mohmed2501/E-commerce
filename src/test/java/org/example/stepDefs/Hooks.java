package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {
    public static WebDriver driver=null;
    @Before
    public static void openBroser() throws InterruptedException {
        String pathbrowser= System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";
        System.out.println(pathbrowser);
        System.setProperty("webdriver.chrome.driver",pathbrowser);

        driver= new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);


    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

