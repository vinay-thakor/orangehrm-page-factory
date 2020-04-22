package com.orangehrmlive.testsuite;/*
 *Vinay Creation
 *Date of Creation
 */

import com.orangehrmlive.pages.AccountPage;
import com.orangehrmlive.pages.HomePage;
import com.orangehrmlive.testbase.TestBase;
import com.orangehrmlive.testdata.TestData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends TestBase {


    //object creation

    HomePage homePage;
    AccountPage accountPage;

    @BeforeMethod(groups = {"Regression", "Sanity", "Smoke"})
    public void setUp() {

        homePage = new HomePage();
        accountPage = new AccountPage();

    }


    //TestCases
    @Test(dataProvider = "login", dataProviderClass = TestData.class, groups = {"Regression", "Sanity"})
    public void verifyUserCanSuccessfullyLogin(String username, String password, String welcomeText) {
        //send text to username field
        homePage.clickAndSendTextToUsernameField(username);
        //send text to password field
        homePage.clickAndSendTextToPasswordField(password);
        //click on login button
        homePage.clickOnLoginBtn();
        //verify text on AccountPage
        accountPage.verifyTextWelcomeAdmin(welcomeText);
    }

    @Test(dataProvider = "logout", dataProviderClass = TestData.class, groups = {"Regression", "Smoke"})
    public void verifyUserCanSuccessfullyLogout(String username1, String password2, String welcome1, String loginpannel) {
        //send text to username field
        homePage.clickAndSendTextToUsernameField(username1);
        //send text to password field
        homePage.clickAndSendTextToPasswordField(password2);
        //click on login button
        homePage.clickOnLoginBtn();
        //verify text on AccountPage
        accountPage.verifyTextWelcomeAdmin(welcome1);
        //click on welcome admin button
        accountPage.clickOnWelcomeAdmin();
        //click on logout link
        accountPage.clickOnLogoutLink();
        //verify text on HomePage
        homePage.verifyTextLoginPanelText(loginpannel);
    }

}
