package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P2_login {
    public WebElement loginLink()
    {
        WebElement link = Hooks.driver.findElement(By.className("ico-login"));
        return link;
    }
    public WebElement email()
    {
        WebElement mail = Hooks.driver.findElement(By.id("Email"));
        return mail;
    }
    public  WebElement password()
    {
        WebElement pass=Hooks.driver.findElement(By.id("Password"));
        return pass;
    }
    public WebElement loginBtn()
    {
        WebElement click=Hooks.driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        return  click;
    }
    public WebElement myAccountLink()
    {
        WebElement msg=Hooks.driver.findElement(By.className("ico-account"));
        return msg;
    }
   public WebElement errorMessage()
     {
       WebElement errormsg=Hooks.driver.findElement(By.xpath("//*[@class='message-error validation-summary-errors']"));
       return errormsg;
     }
}
