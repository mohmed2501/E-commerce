package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage homePage=new P03_homePage();

    @When("user click on wishlist button of product")
    public void productBtn()
    {
        homePage.addBtn().click();
    }
    @Then("success message should be displayed")
    public void successMsg()
    {
     String expectedMsg= "The product has been added to your wishlist";
     String actualMsg=homePage.showSuccessMsg().getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(expectedMsg.contains(actualMsg));
        String expectedColor="#4bb07a";
        String actualColor= Color.fromString(homePage.showSuccessMsg().getCssValue("background-color")).asHex();
        softAssert.assertEquals(actualColor,expectedColor);

    }
    @And("user click on wishlistlink of products")
    public void clickonWishlistLink()
    {
        WebDriverWait webDriverWait=new WebDriverWait(Hooks.driver,Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.invisibilityOf(homePage.showSuccessMsg()));
        homePage.clickWishlistLink().click();
    }
    @Then("user will find the quantity of products more than zero")
    public void quantityOfProducts()
    {
        String itemQuantity= homePage.showQuantity().getAttribute("value");
        Assert.assertNotEquals(itemQuantity,0);
    }

}
