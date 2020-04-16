package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractBasePage;
import utilities.BrowserUtils;

public class TestCase_11_Page extends AbstractBasePage {

    @FindBy(xpath = "(//a[@class='b24-app-block-content-apps'])[1]")
    private WebElement macOS;


// method

    public void clickOnMacOS() {

        // helps to you to scroll down
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        BrowserUtils.wait(4);
        macOS.click();
        BrowserUtils.wait(7);
    }

    @FindBy(xpath = "//a[@class='b24-app-block-content-apps b24-app-block-separate'][1]")
    private WebElement windowsElement;

    public void clickOnWindows() {
        // helps to you to scroll down
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        BrowserUtils.wait(4);
        macOS.click();
        BrowserUtils.wait(15);
    }

    @FindBy(xpath = "//a[@class='b24-app-block-content-apps b24-app-block-separate'][2]")
    private WebElement linuxElement;

    public void clickOnLinux() {
        // helps to you to scroll down
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        BrowserUtils.wait(4);
        macOS.click();
        BrowserUtils.wait(15);


    }
}