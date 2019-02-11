package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class BriteLoginPage {
    WebDriver driver;

    public BriteLoginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id='login']")
    public WebElement loginBox;

    @FindBy(xpath="//*[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath=".//a[@href='/web?db=BriteErpDemo']" )
    public WebElement demoButton;

    @FindBy(xpath="//*[@id='wrapwrap']/main/div/form/div[4]/button")
    public WebElement loginbtn;

}
