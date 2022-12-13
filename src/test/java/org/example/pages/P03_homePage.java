package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class P03_homePage {
    public WebElement currency()
    {
        WebElement cuurency_list= Hooks.driver.findElement(By.id("customerCurrency"));
        return cuurency_list;
    }
    @FindBy( css = "span[class='price actual-price']")
    public  WebElement productPrice;

    public List<WebElement> prices()
    {

        List<WebElement>prices= Hooks.driver.findElements(By.cssSelector("span[class='price actual-price']"));
        return  prices;
    }
    public WebElement searchIteam()
    {
        WebElement searchbar= Hooks.driver.findElement(By.id("small-searchterms"));
        return  searchbar;
    }
    public  WebElement searchBtn()
    {
        WebElement btn=Hooks.driver.findElement(By.xpath("//*[@class='button-1 search-box-button']"));
        return btn;
    }
    public WebElement proudctItem()
    {
        WebElement pitem=Hooks.driver.findElement(By.className("product-item"));
        return pitem;
    }

    public List <WebElement> selectItem()
    {
       List<WebElement>items=Hooks.driver.findElements(By.className("product-item"));
       return items;
    }
    public WebElement sku()
    {
        WebElement sku=Hooks.driver.findElement(By.className("sku"));
        return sku;
    }

   public List<WebElement>mainCategories()
   {
       List<WebElement>maincategory=Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
     return maincategory;
   }
    public List<WebElement>subCategories(int randomCategory)
    {
        randomCategory+=1;
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+randomCategory+" ]/ul[@class=\"sublist first-level\"]/li"));
    }
    public  WebElement pageTitle()
    {
        WebElement title= Hooks.driver.findElement(By.cssSelector("div[class='page-title']"));
        return title;
    }
    public WebElement clickOnFirstSlider()
    {
        WebElement click=Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));
        return click;
    }
    public WebElement clickOnSecondSlider()
    {
        WebElement click2=Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
        return click2;
    }
    public WebElement controlSlide()
    {
        WebElement control=Hooks.driver.findElement(By.linkText("1"));
        return control;
    }

    public WebElement getLinkFacebook()
    {
        WebElement link=Hooks.driver.findElement(By.className("facebook"));
        return link;
    }
    public WebElement getLinkTwitter()
    {
        WebElement link=Hooks.driver.findElement(By.className("twitter"));
        return link;
    }
    public WebElement getLinkRss()
    {
        WebElement link=Hooks.driver.findElement(By.className("rss"));
        return link;
    }
    public WebElement getLinkYoutube()
    {
        WebElement link=Hooks.driver.findElement(By.className("youtube"));
        return link;
    }
   public WebElement addBtn()
   {
       WebElement click =Hooks.driver.findElement(By.xpath("//div[@class='master-wrapper-content']//div[3]//div[1]//div[2]//div[3]//div[2]//button[3]"));
       return click;
   }
   public WebElement showSuccessMsg()
   {
       WebElement msg=Hooks.driver.findElement(By.id("bar-notification"));
       return msg;
   }
   public WebElement clickWishlistLink()
   {
    WebElement click =Hooks.driver.findElement(By.className("wishlist-label"));
    return click;
   }
   public WebElement showQuantity()
   {
       WebElement quantity=Hooks.driver.findElement(By.className("qty-input"));
       return quantity;
   }
}

