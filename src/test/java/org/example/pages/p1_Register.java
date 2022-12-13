package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class p1_Register {
    public WebElement registerlink()
    {
        WebElement reg = Hooks.driver.findElement(By.className("ico-register"));
        return reg;
    }

    public WebElement genderm()
    {
        WebElement male= Hooks.driver.findElement(By.className("male"));
        return male;
    }
    public  WebElement fname()
    {
        WebElement firstname =Hooks.driver.findElement(By.id("FirstName"));
        return firstname;
    }
    public WebElement lname()
    {
        WebElement lastname=Hooks.driver.findElement(By.id("LastName"));
        return lastname;
    }
    public WebElement dateOfBirthDay()
    {
        WebElement day =Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return day;
    }
    public WebElement dateOfBirthMonth()
    {
        WebElement month=Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }
    public WebElement dateOfBirthYear()
    {
        WebElement year=Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }
    public WebElement emailUser()
    {
        WebElement mail =Hooks.driver.findElement(By.id("Email"));
        return mail;
    }
    public WebElement password()
    {
        WebElement pass=Hooks.driver.findElement(By.id("Password"));
        return pass;
    }
   public WebElement confirmPassword()
   {
       WebElement cofirm =Hooks.driver.findElement(By.id("ConfirmPassword"));

       return cofirm;
   }

   public WebElement registerClick()
   {
       WebElement click=Hooks.driver.findElement(By.id("register-button"));
       return click;
   }
   public WebElement succesMsgShow()
   {
       WebElement msg=Hooks.driver.findElement(By.className("result"));
       return msg;
   }

}
