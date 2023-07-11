package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utility {
    By accountCreatedText = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    public void enterdetail (){
        sendTextToElement(By.id("input-firstname"), "prime");
        sendTextToElement(By.id("input-lastname"), "test");
        sendTextToElement(By.id("input-email"), "prime@gmail.com");
        sendTextToElement(By.id("input-telephone"), "07988112233");
        sendTextToElement(By.id("input-password"), "test123");
        sendTextToElement(By.id("input-confirm"), "test123");
        selectByVisibleTextFromDropDown(By.xpath("//fieldset[3]//input"), "Yes");
        clickOnElement(By.xpath("//div[@class = 'buttons']//input[@name='agree']"));
        clickOnElement(By.xpath("//div[@class = 'buttons']//input[@value='Continue']"));
    }
    public String getaccountcreatedText() throws InterruptedException {
            Thread.sleep(1000);
            return getTextFromElement(accountCreatedText);
        }
        public void verifyMessage(){
            Assert.assertEquals("", "Your Account Has Been Created!",
                    getTextFromElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]")));
        }

    }



