package com.orangehrmlive.browserselector;/*
 *Vinay Creation
 *Date of Creation
 */

import com.orangehrmlive.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserSelector extends BasePage {

    String projectPath = System.getProperty("user.dir");

    //method for selection of browser
    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("opera")) {
            System.setProperty("webdriver.opera.driver", "drivers/operadriver.exe");
            driver = new OperaDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer2.40.0.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong browser selected");
        }

    }
}
