package com.tutorialsninja.testsuit;

import com.tutorialsninja.pages.Homepage;
import com.tutorialsninja.pages.MyAccounts;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {
    Homepage homePage=new Homepage();
    MyAccounts myAccounts =new MyAccounts();
    @Test public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        myAccounts.clickOnMyAccount();
        myAccounts.selectMyAccountOptions("Register");
        myAccounts.VerifyRegister();
    }
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        myAccounts.clickOnMyAccount();
        myAccounts.selectMyAccountOptions("Login");
        myAccounts.enterdetail();


    }




}
