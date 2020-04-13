package com.Bitrix24.tests;

import com.Bitrix24.base.AbstractPageBase;
import com.Bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Author : Hasibe
 * UserStory: #3
 */

public class EventCreation extends AbstractPageBase {
    /**
     * acceptance criteria 2 (positive)
     * 1. User logsin with valid credentials
     * 2. User clicks on event tab under the activity stream
     * 3. User clicks on link button
     * 4. User enters link text
     * 5. User enters link URL
     * 6. User clicks save
     * 7. Verify that user was able to add a link ---> actual link text equals expected link text
     */

    @Test
    public void uploadingLinkPositiveTest(){
        logInPage.logIn(ConfigurationReader.getProperty("helpdesk1"),ConfigurationReader.getProperty("password"));
       wait.until(ExpectedConditions.visibilityOf(activityStream.event));
        activityStream.event.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.uploadLinkBtn));
        activityStream.uploadLinkBtn.click();
        activityStream.linkText.sendKeys("rain rain go away");
        activityStream.linkLink.sendKeys("https://www.google.com/");
        wait.until(ExpectedConditions.visibilityOf(activityStream.saveBtn));
        activityStream.saveBtn.click();
        driver.switchTo().frame(activityStream.iFrame);
        Assert.assertEquals(activityStream.link.getText(),"rain rain go away");

    }

    /**
     * AC - 2 (Negative)
     * 1. user logs in with valid username and password
     * 2. user clicks on event tab under activity stream
     * 3. user clicks on upload link
     * 4. user clicks save without entering link text & link URL
     * 6. user clicks save
     * 7. verify that user not able to save / add a link
     */

    @Test
    public void uploadingNegativeTest(){
        logInPage.logIn(ConfigurationReader.getProperty("helpdesk1"),ConfigurationReader.getProperty("password"));
        wait.until(ExpectedConditions.visibilityOf(activityStream.event));
        activityStream.event.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.uploadLinkBtn));
        activityStream.uploadLinkBtn.click();
        activityStream.saveBtn.click();
        Assert.assertTrue(activityStream.saveBtn.isDisplayed());

    }









}
