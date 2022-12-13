package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;


public class D07_followUsStepDef {
    P03_homePage homePage=new P03_homePage();

   @When("user click on facebook link")
    public void faceBookLink()throws InterruptedException
   {
       homePage.getLinkFacebook().click();
       Thread.sleep(2000);
   }

   @Then("user should navigate to facebook website")
    public void navigateToFacebook() throws InterruptedException
   {
       ArrayList <String>windowes =new ArrayList<String>(Hooks.driver.getWindowHandles());

       Hooks.driver.switchTo().window(windowes.get(1));
       Thread.sleep(1000);
       System.out.println(Hooks.driver.getCurrentUrl());
       String expectedurl= "https://www.facebook.com/nopCommerce";
       String actulurl= Hooks.driver.getCurrentUrl();
       Assert.assertEquals(expectedurl,actulurl);
   }

   @When("user click on twitter link")
    public void twitterlink()throws InterruptedException
   {
       homePage.getLinkTwitter().click();
       Thread.sleep(2000);
   }


   @Then("user should navigate to twitter website")
    public void navigateToTwitter() throws InterruptedException
   {
       ArrayList <String>windowes =new ArrayList<String>(Hooks.driver.getWindowHandles());
       Hooks.driver.switchTo().window(windowes.get(1));
       Thread.sleep(1000);
       System.out.println(Hooks.driver.getCurrentUrl());
       String expectewitterdurl= "https://twitter.com/nopCommerce";
       String actultwitterurl= Hooks.driver.getCurrentUrl();
       Assert.assertEquals(expectewitterdurl,actultwitterurl);
   }
   @When("user click on rss link")
    public void rssLink() throws InterruptedException
   {
       homePage.getLinkRss().click();
       Thread.sleep(2000);
   }
   @Then("user should navigate to rss website")
    public void navigateToRss()throws InterruptedException
   {
       ArrayList <String>windowes =new ArrayList<String>(Hooks.driver.getWindowHandles());

       Hooks.driver.switchTo().window(windowes.get(1));
       Thread.sleep(1000);
       System.out.println(Hooks.driver.getCurrentUrl());
       String expectedRssurl= "https://demo.nopcommerce.com/new-online-store-is-open";
       String actulRssurl= Hooks.driver.getCurrentUrl();
       Assert.assertEquals(expectedRssurl,actulRssurl);
   }

   @When("user click on youtube link")
    public void youtubeLink()throws InterruptedException
   {
       homePage.getLinkYoutube().click();
       Thread.sleep(2000);
   }
   @Then("user should navigate to youtube website")
    public void navigateToYoutube()throws InterruptedException
   {
       ArrayList <String>windowes =new ArrayList<String>(Hooks.driver.getWindowHandles());

       Hooks.driver.switchTo().window(windowes.get(1));
       Thread.sleep(1000);
       System.out.println(Hooks.driver.getCurrentUrl());
       String expectedYoutubeurl= "https://www.youtube.com/user/nopCommerce";
       String actulYoutubeurl= Hooks.driver.getCurrentUrl();
       Assert.assertEquals(expectedYoutubeurl,actulYoutubeurl);
   }

}
