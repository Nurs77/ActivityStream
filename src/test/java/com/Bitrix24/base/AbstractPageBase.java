package com.Bitrix24.base;

;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BrowserUtils;
import utilities.Driver;

public abstract class AbstractPageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 15);

    public AbstractPageBase() {
        PageFactory.initElements(driver, this);
    }

    public void navigateTo(String tabName) {

        String tabNameXpath = "//span[text()='"+ tabName + "']";
        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        wait.until(ExpectedConditions.elementToBeClickable(tabElement));
        tabElement.click();
        BrowserUtils.wait(3);
    }
}









