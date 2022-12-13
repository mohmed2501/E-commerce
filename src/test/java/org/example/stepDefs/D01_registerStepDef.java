package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.p1_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    p1_Register register=new p1_Register();

    @Given("user go to register page")
    public void goToRegister() {
        System.out.println("this is test before");

           register.registerlink().click();

    }
    @When("user select gender type")
    public void selectGenderM()
    {
        register.genderm().click();
    }
    @And("user enter First Name {string}")
    public void fUsername( String fname)
    {
      register.fname().sendKeys(fname);
    }
    @And("user Enter Last Name  {string}")
     public void lUsername(String lname)
    {
        register.lname().sendKeys(lname);
    }
    @And("user Enter Date of birth")
    public void enterDateOfBirth() {
        Select day = new Select(register.dateOfBirthDay());
        day.selectByValue("25");

        Select month = new Select(register.dateOfBirthMonth());
        month.selectByValue("4");

        Select year = new Select(register.dateOfBirthYear());
        year.selectByValue("2000");
    }
    @And("user enter valid email")
    public void email()
    {
        register.emailUser().sendKeys("mohmed2501@gmail.com");
    }
    @And("user enter matched password")
    public void userPassword()
    {
        register.password().sendKeys("momo_2000");
    }
    @And("user enter confirm password")
    public void confirmPass()
    {
        register.confirmPassword().sendKeys("momo2000");
    }
    @And("user clicks on register button")
    public void registerClick()
    {
        register.registerClick().click();
    }
    @Then("success message is displayed")
    public void successMsg()
    {
        String expectedMessage = "Your registration completed";
        String actualMessage = register.succesMsgShow().getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualMessage, expectedMessage);
        String expectedMessageColor = "rgba(76, 177, 124, 1)";
        String actualMessageColor = (register.succesMsgShow().getCssValue("color"));
        softAssert.assertEquals(actualMessageColor, expectedMessageColor);
        softAssert.assertAll();
    }






}
