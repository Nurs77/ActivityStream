package com.Bitrix24.base;

import com.Bitrix24.pages.LogInPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractPageBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected LogInPage logInPage;

    @BeforeMethod
    public void setUpMethod(){
        driver.get(ConfigurationReader.getProperty("url"));
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        logInPage = new LogInPage();

    }
    @AfterMethod
    public void tearDownMethod()  {

        Driver.closeDriver();
    }






}
