package com.tutorialsninja.pages;


import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Jay Vaghani
 */
public class Homepage extends Utility {
    By desktoplink = By.xpath("//a[text()='Desktops']");
    By showAllDesktop = By.xpath("//a[contains(text(),'Show AllDesktops')]");
    By laptopAndDesktopLink = By.linkText("Laptops & Notebooks");
    By showAllLaptopsAndNotebooks=By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");
    By componentsLink = By.linkText("Components");
    By showAllComponent =By.xpath("//h2[contains(text(),'Components')]");
    By accountLogout = By.xpath("//h1[normalize-space()='Account Logout']");
    By myAccount = By.xpath("//h2[normalize-space()='My Account']");

    By currency = By.xpath("//span[contains(text(),'Currency')]");
    By currencyPound= By.xpath("//button[contains(text(),'£Pound Sterling')]");
    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));

    }
    public void clickOnCurrencyChange(){

        clickOnElement(currency);
        clickOnElement(currencyPound);
    }

    public void mouseHoverAndClickOnDeskTop()  {

        mouseHoverToElementAndClick(desktoplink);
    }

    public void clickOnShowAlldeskTop()  {

        mouseHoverToElementAndClick(showAllDesktop);
    }

    public void mouseHoveOnLaptopAndNotebooks() {
        mouseHoverToElementAndClick(laptopAndDesktopLink);
    }
    public void ClickonShowAllLaptopsAndNotebooks(){
        clickOnElement(showAllLaptopsAndNotebooks);
    }

    public void verifyTextDestop() {
        String actual = getTextFromElement(desktoplink);
        String expected = "Desktops";
        Assert.assertEquals(actual,"Desktops","Both textare not equal");

    }
    public void PassShowAllComponents(){
        selectMenu("Show All Components");
    }
    public void mousehoveronComponents() {
        mouseHoverToElementAndClick(componentsLink);
    }
    public void verifyComponents(){
        String actual =getTextFromElement(By.xpath("//li[@class='dropdown']//a[text()='Components']"));
        Assert.assertEquals(actual,"Components","Both text are not equal");
    }
    public String getAccountLogoutText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(accountLogout);
    }

    public String getMyAccountText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(myAccount);
    }

}
