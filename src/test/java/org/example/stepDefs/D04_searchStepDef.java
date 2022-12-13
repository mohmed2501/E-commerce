package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
   P03_homePage homePage=new P03_homePage();
    @When("user go to search field")
    public void userGoToSearchField()
    {
        homePage.searchIteam().click();
    }
    @And("user search with {string}")
    public void searhAbout(String arg0)
    {
        homePage.searchIteam().sendKeys(arg0);
        homePage.searchBtn().click();
    }
    @Then("user should find {string} in search result")
    public void searchWithValidResult(String arg0)
    {
        SoftAssert softAssert=new SoftAssert();
        String expectedUrl="https://demo.nopcommerce.com/search?q=";
        String actualUrl=Hooks.driver.getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrl));
        for (int i =0 ; i<homePage.selectItem().size();i++)
        {
           String proudctitem= homePage.selectItem().get(i).getText().toLowerCase();
            softAssert.assertTrue(proudctitem.contains(arg0));

        }
        softAssert.assertAll();
    }
    @Then("user should find {string} in Product result Details")
    public void userShouldFindInProductResultDetails(String arg0)
    {
        SoftAssert softAssert=new SoftAssert();
        homePage.proudctItem().click();
        String item= homePage.sku().getText();
        System.out.println(item);
        softAssert.assertTrue(item.contains(arg0));
        softAssert.assertAll();
    }

}
