package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasesPage {
    WebDriver driver;

    public PurchasesPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[@href='/web#menu_id=504&action=']")
    public WebElement puchasesMod;



    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[7]/ul[1]/li[2]/a/span")
    public WebElement PurchaseOrderbtn;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[7]/ul[1]/li[3]/a/span")
    public WebElement vendorsbtn;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[7]/ul[1]/li[4]/a/span")
    public WebElement productsbtn;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[7]/ul[2]/li[1]/a/span")
    public WebElement incomproductsbtn;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[7]/ul[2]/li[2]/a/span")
    public WebElement venbillbtn;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[7]/div[3]/a/span")
    public WebElement reportingbtn;






}
