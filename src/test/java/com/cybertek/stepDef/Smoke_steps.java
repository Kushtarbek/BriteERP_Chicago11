package com.cybertek.stepDef;

import com.cybertek.pages.BriteLoginPage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Smoke_steps {


    BriteLoginPage brite =new BriteLoginPage();

    @When("user goes to Brite application")
    public void user_goes_to_Brite_application() {
        Driver.getDriver().get("http:\\52.39.162.23\\web\\login");
        brite.demoButton.click();

    }

    @Then("user should see login page")
    public void user_should_see_login_page() {
    brite.loginBox.sendKeys("in_pos_manager@info.com");
    brite.passwordBox.sendKeys("KjKtfgrs30");
    brite.loginbtn.click();

    }

}
