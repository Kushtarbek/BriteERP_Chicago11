package com.cybertek.stepDef;

import com.cybertek.pages.BriteLoginPage;
import com.cybertek.pages.PurchasesPage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;



public class Smoke_steps {


    BriteLoginPage brite =new BriteLoginPage();
    PurchasesPage purchase = new PurchasesPage();

    @When("user goes to Brite application")
    public void user_goes_to_Brite_application() {
        Driver.getDriver().get("http:\\52.39.162.23\\web\\login");
        brite.demoButton.click();

    }

    @Then("user should see login page")
    public void user_should_see_login_page() throws InterruptedException {
    brite.loginBox.sendKeys("in_pos_manager@info.com");
    brite.passwordBox.sendKeys("KjKtfgrs30");
    brite.loginbtn.click();
    Thread.sleep(5000);


    }

    @When("user clicks on purchases")
    public void user_clicks_on_purchases() throws InterruptedException {
        Thread.sleep(5000);
        purchase.puchasesMod.click();

    }

    @Then("user clicks on Request for quotations link")
    public void user_clicks_on_Request_for_quotations_link() throws InterruptedException {

        Thread.sleep(5000);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Requests for Quotation - Odoo";
        assertEquals(expectedTitle, actualTitle);
    }

    @When("user clicks on Purchases order")
    public void user_clicks_on_Purchases_order() throws InterruptedException {
        Thread.sleep(5000);
        purchase.PurchaseOrderbtn.click();

    }

    @Then("user verifies the title")
    public void user_verifies_the_title() throws InterruptedException {
        Thread.sleep(5000);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Purchase Orders - Odoo";
        //assertEquals(expectedTitle, actualTitle);

    }

    @Then("user clicks on Vendors")
    public void user_clicks_on_Vendors() throws InterruptedException {

       purchase.vendorsbtn.click();
        Thread.sleep(10000);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle1 = "Vendors - Odoo";
        //Assert.assertEquals(expectedTitle1, actualTitle);
    }

    @Then("user clicks on Products")
    public void user_clicks_on_Products() throws InterruptedException {
        Thread.sleep(5000);
        purchase.productsbtn.click();

    }

    @Then("user clicks on Incoming Products")
    public void user_clicks_on_Incoming_Products() throws InterruptedException {
        Thread.sleep(5000);
        purchase.incomproductsbtn.click();
    }

    @Then("user clicks on Vendors bills")
    public void user_clicks_on_Vendors_bills() throws InterruptedException {
        Thread.sleep(5000);
        purchase.venbillbtn.click();
    }

    @Then("user clicks on Reporting")
    public void user_clicks_on_Reporting() throws InterruptedException {
        Thread.sleep(5000);
        purchase.reportingbtn.click();
    }

    @Then("user should see reports")
    public void user_should_see_reports() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



}
