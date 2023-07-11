package com.tutorialsninja.testsuit;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {
    Homepage homePage = new Homepage();
    DesktopPage desktopPage = new DesktopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        homePage.clickOnCurrencyChange();
        String menuName = "Show AllDesktops";
        homePage.mouseHoverAndClickOnDeskTop();
        homePage.selectMenu(menuName);
        String excepted = desktopPage.beforeSortDesktopByPositionZtoA().toString();
        String actual = desktopPage.afterSortDesktopByPositionZtoA().toString();
        Assert.assertTrue(excepted.contains(actual));
    }
}