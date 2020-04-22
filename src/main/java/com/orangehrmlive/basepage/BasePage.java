package com.orangehrmlive.basepage;/*
 *Vinay Creation
 *Date of Creation
 */

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

    // create a constructor
    public BasePage(){
        //setting pro for log4j
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/orangehrmlive/resources/properties/log4J.properties");
        //setting pro fot page factory
        PageFactory.initElements(driver,this);
    }


}
