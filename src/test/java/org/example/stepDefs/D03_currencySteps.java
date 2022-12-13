package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currencySteps {

    P03_homePage homePage =new P03_homePage();
    @When("user select euro option")
    public void select_euro()
    {


        Select select=new Select(homePage.currency());
        select.selectByVisibleText("Euro");

    }
    @Then("the price of products will be with euro")
    public void displyPrices ()
    {


        for (int i=0;i<4 ;i++)
        {

            String values= homePage.prices().get(i).getText();
            System.out.println(values);
            Assert.assertTrue(values.contains("€"));
        }

    }

}
