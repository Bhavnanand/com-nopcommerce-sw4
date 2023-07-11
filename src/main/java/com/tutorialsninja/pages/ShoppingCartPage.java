package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
By shoppingCart =By.xpath("//a[contains(text(),'shopping cart')]");
    public String getShoppingCartText(){
return getTextFromElement(shoppingCart);
    }

}
