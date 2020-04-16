package com.Bitrix24.tests;

import com.Bitrix24.base.AbstractPageBase;
import com.Bitrix24.pages.LogInPage;
import com.Bitrix24.utilities.BrowserUtils;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbstractBasePage;


public class PostLikeCommentUnfollow extends AbstractPageBase {

    /**
     * Author : Nursultan Tolebpergen
     * User Story :
     *
     *
     *
     */
    @Test
    public void likeCommentUnfollow(){

        logInPage.logIn(ConfigurationReader.getProperty("helpdesk1"), ConfigurationReader.getProperty("password"));
        BrowserUtils.wait(3);
        activityStream.likeBtn.click();
        BrowserUtils.wait(2);
        activityStream.commentBtn.click();
        BrowserUtils.wait(3);
        driver.findElement(By.tagName("body")).sendKeys("Thank you!");
        BrowserUtils.wait(1);

        activityStream.sendBtn.click();
        BrowserUtils.wait(2);
        activityStream.unfollowBtn.click();
        BrowserUtils.wait(2);

        Assert.assertTrue(activityStream.commentSection.isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Follow')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className("feed-post-emoji-top-panel-outer")).isDisplayed());






    }
}
