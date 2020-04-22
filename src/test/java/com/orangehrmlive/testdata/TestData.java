package com.orangehrmlive.testdata;/*
 *Vinay Creation
 *Date of Creation
 */

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "login")
    public Object[][]getData(){
        return new Object[][]{
                {"Admin","admin123","Welcome Admin"}
        };
    }

    //
    @DataProvider(name = "logout")
    public Object[][]getData1(){
        return new Object[][]{
                {"Admin","admin123","Welcome Admin","LOGIN Panel"}
        };
    }
}
