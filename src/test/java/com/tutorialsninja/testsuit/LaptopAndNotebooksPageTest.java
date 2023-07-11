package com.tutorialsninja.testsuit;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class LaptopAndNotebooksPageTest extends BaseTest {
    Homepage homePage = new Homepage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {

        String menuName = "Show AllLaptops & Notebooks";
        homePage.mouseHoveOnLaptopAndNotebooks();
        homePage.selectMenu(menuName);

    }

    @Test
    public void atUserPlaceOrderSuccessfully() {
        homePage.mouseHoveOnLaptopAndNoteboverifyThoks();
        homePage.clickOnShowAlldeskTop();
        desktopPage.VerifyProductInDescendingOrder();
        laptopsAndNotebooksPage.ProductMacbook();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully()  {
        String menuName = "Show AllLaptops & Notebooks";
        homePage.mouseHoveOnLaptopAndNotebooks();
        homePage.selectMenu(menuName);
        laptopsAndNotebooksPage.VerifyTextMacbook();

    }


}
