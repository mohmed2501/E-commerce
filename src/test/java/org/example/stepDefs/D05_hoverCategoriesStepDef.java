package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage=new P03_homePage();
    int randomnum=new Random().nextInt(3);
    int randomSubCategory= new Random().nextInt(3);
    @When("user hover a category and select sub category")
    public void  hoverCategory()
    {

        Actions actions=new Actions(Hooks.driver);
        actions.moveToElement(homePage.mainCategories().get(randomnum)).perform();
        String maincategory =homePage.mainCategories().get(randomnum).getText();
        homePage.subCategories(randomnum).get(randomSubCategory).click();

    }
    @Then("user should find the sub category name in page title")
    public void categoryTitle()
    {
        String subcategory= homePage.subCategories(randomnum).get(randomSubCategory).getText();
        String pagetitle=homePage.pageTitle().getText();
        System.out.println(pagetitle);
        Assert.assertTrue(pagetitle.contains(subcategory));
    }

}
