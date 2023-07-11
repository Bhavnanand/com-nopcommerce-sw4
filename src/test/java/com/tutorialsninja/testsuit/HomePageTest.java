package com.tutorialsninja.testsuit;

import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    Homepage homepage = new Homepage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homepage.mouseHoverAndClickOnDeskTop();
       // homepage.clickOnShowAlldeskTop();
        homepage.clickOnShowAlldeskTop();
    }
@Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
homepage.mouseHoverAndClickOnDeskTop();
    //2.2 call selectMenu method and pass the menu“Show All Laptops & Notebooks”
   // homepage.selectMenu("Show All Laptops & Notebooks");
}
@Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
//3.1 Mouse hover on “Components” Tab and click
    homepage.mousehoveronComponents();
//3.2 call selectMenu method and pass the menu = “Show All Components”
   homepage.selectMenu("Show All Components)");
        //    3.3 Verify the text ‘Components’
 }



}
