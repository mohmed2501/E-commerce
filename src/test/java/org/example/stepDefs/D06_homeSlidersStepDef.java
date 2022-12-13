package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {

    P03_homePage homePage=new P03_homePage();
    @When("user click on first slider")
    public void firstslider()
    {
        homePage.controlSlide().click();
        homePage.clickOnFirstSlider().click();
    }
    @Then("user navigates to first slider")
    public void navigateToFirstSlider()
    {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/nokia-lumia-1020"));
       String expetedurl = "\"https://demo.nopcommerce.com/nokia-lumia-1020\"";
       String actualurl= Hooks.driver.getCurrentUrl();

        Assert.assertEquals(actualurl,expetedurl);
    }
    @When("user click on second slider")
    public void secondslider () throws InterruptedException
    {
        homePage.controlSlide().click();
        homePage.clickOnSecondSlider().click();

    }
    @Then("user navigates second slider product page")
    public void navigateToSecondDlide()
    {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/iphone-6"));


        String expetedurl2="https://demo.nopcommerce.com/iphone-6";
        String actualurl2=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualurl2,expetedurl2);
    }

}
