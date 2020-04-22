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

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    //list of elements and their locations

    // By welcomeAdmin = By.cssSelector("a.panelTrigger");
    //By logoutLink = By.xpath("//a[contains(text(),'Logout')]");

    @FindBy(css = "a.panelTrigger")
    WebElement _welcomeAdmin;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement _logoutLink;

    //methods performing actions on elements
    public void verifyTextWelcomeAdmin(String welcomeAdmin) {
        Reporter.log("Verify welcome text " + welcomeAdmin + "from the Web page " + _welcomeAdmin.toString() + "<br>");
        verifyTextAssertMethod(_welcomeAdmin, welcomeAdmin);
        log.info("Verify welcome text " + welcomeAdmin + "from the Web page " + _welcomeAdmin.toString());
    }

    public void clickOnWelcomeAdmin() {
        Reporter.log("Clicking on Welcome Admin " + _welcomeAdmin.toString() + "<br>");
        clickOnElement(_welcomeAdmin);
        log.info("Clicking on Welcome Admin " + _welcomeAdmin.toString());
    }

    public void clickOnLogoutLink() {
        Reporter.log("Clicking on Logout button " + _logoutLink.toString() + "<br>");
        clickOnElement(_logoutLink);
        log.info("Clicking on Logout button " + _logoutLink.toString());
    }
}
