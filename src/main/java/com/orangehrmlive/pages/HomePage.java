package com.orangehrmlive.pages;/*
 *Vinay Creation
 *Date of Creation
 */

import com.orangehrmlive.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger((HomePage.class.getName()));


//    By usernameField = By.cssSelector("input#txtUsername");
//    By passwordField = By.cssSelector("input#txtPassword");
//    By loginBtn = By.cssSelector("input.button");
//    By loginPanelText = By.cssSelector("div#logInPanelHeading");

    @FindBy(css = "input#txtUsername")
    WebElement _usernameField;
    @FindBy(css = "input#txtPassword")
    WebElement _passwordField;
    @FindBy(css = "div#logInPanelHeading")
    WebElement _loginPanelText;
    @FindBy(css = "input.button")
    WebElement _loginBtn;

    //methods performing actions on elements
    public void clickAndSendTextToUsernameField(String userName) {
        Reporter.log("Clicking and send text to " + userName + "username field " + _usernameField.toString() + "<br>");
        sendTextToElement(_usernameField, userName);
        log.info("Clicking and send text to " + userName + "username field " + _usernameField.toString());
    }

    public void clickAndSendTextToPasswordField(String password) {
        Reporter.log("Click and send password " + password + " to password field " + _passwordField.toString());
        sendTextToElement(_passwordField, password);
        log.info("Click and send password " + password + " to password field " + _passwordField.toString());
    }

    public void clickOnLoginBtn() {
        Reporter.log("Clicking on Login button :" + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn);
        log.info("Clicking on Login button :" + _loginBtn.toString());
    }

    public void verifyTextLoginPanelText(String loginPanel) {
        verifyTextAssertMethod(_loginPanelText, loginPanel);
    }
}



