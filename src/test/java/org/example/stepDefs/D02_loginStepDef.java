package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P2_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P2_login login= new P2_login();
    SoftAssert softAssert = new SoftAssert();
    @Given("user should navigate to login page")
    public void navigateLogin()
    {
        login.loginLink().click();
    }

    @When("user enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String email, String password) {
        login.email().sendKeys(email);
        login.password().sendKeys(password);
    }
    @And("user click on login button")
    public void btnLogin ()
    {
        login.loginBtn().click();
    }
    @Then("user login to the web application successfully")
    public void couldLogin() throws InterruptedException {
        String expectedUrl="https://demo.nopcommerce.com/";
        String actualUrl=Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);
        boolean expectedResult = true;
        boolean actualResult= login.myAccountLink().isDisplayed();
        softAssert.assertEquals(actualResult,expectedResult);
        softAssert.assertAll();
        Thread.sleep(3000);
    }
    @Then("user could not login to the web application")
    public void couldNotLogin()
    {
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.";
        String actualMessage = login.errorMessage().getText();
        softAssert.assertTrue(actualMessage.contains(expectedMessage) );
        String expectedMessageColor = "#e4434b";
        String actualMessageColor =  Color.fromString(login.errorMessage().getCssValue("color")).asHex();;

        softAssert.assertEquals(actualMessageColor, expectedMessageColor);
        softAssert.assertAll();
    }
}
