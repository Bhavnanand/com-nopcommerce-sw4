package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MyAccounts extends Utility {
    By myaccount =By.xpath("//span[contains(text(),'My Account')]");

    public void selectMyAccountOptions(String options)  {
        List<WebElement> option = driver.findElements(By.xpath("//nav[@id='top']"));
        clickOnElement(By.linkText(options));
    }
    public void clickOnMyAccount(){
        clickOnElement(myaccount);
    }
    public void VerifyRegister(){
        String expectedMessage = "Register Account";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Register Account')]"));
        Assert.assertEquals("Register page not displayed", expectedMessage, actualMessage);
    }
    public void enterdetail(){
        sendTextToElement(By.id("input-firstname"), "prime");
        sendTextToElement(By.id("input-lastname"), "test");
        sendTextToElement(By.id("input-email"), "prime@gmail.com");
        sendTextToElement(By.id("input-telephone"), "07988112233");
        sendTextToElement(By.id("input-password"), "test123");
        sendTextToElement(By.id("input-confirm"), "test123");
        selectByContainsTextFromListOfElements(By.xpath("//fieldset[3]//input"), "Yes");

    }


    }


