package com.Bitrix24.tests;

import com.Bitrix24.base.AbstractPageBase;
import com.Bitrix24.utilities.BrowserUtils;
import com.Bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskChecklist extends AbstractPageBase {
// User story:
// 2. As a user, I should be able to assign tasks by clicking on Task tab under Active Stream.
// Acceptance Criteria:
// 7. User should be able to click on "Checklist" to create checklists items(Things to do).
// User can add a checklist item by clicking on add button or check mark.
// User can add separator lines between checklist items.
// User can delete a checklist item by clicking on x mark.

    @Test
    public void createChecklist(){
        logInPage.logIn(ConfigurationReader.getProperty("hr2"), ConfigurationReader.getProperty("password"));
        wait.until(ExpectedConditions.visibilityOf(activityStream.tasks));
        activityStream.tasks.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.newTaskBtn));
        activityStream.newTaskBtn.click();
        driver.switchTo().frame(activityStream.iFrame2);
        wait.until(ExpectedConditions.visibilityOf(activityStream.checklistBtn));
        activityStream.checklistBtn.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.thingsToDo));
        Assert.assertTrue(activityStream.thingsToDo.isDisplayed());
    }

    @Test
    public void addChecklistItems(){
        logInPage.logIn(ConfigurationReader.getProperty("hr2"), ConfigurationReader.getProperty("password"));
        wait.until(ExpectedConditions.visibilityOf(activityStream.tasks));
        activityStream.tasks.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.newTaskBtn));
        activityStream.newTaskBtn.click();
        driver.switchTo().frame(activityStream.iFrame2);
        wait.until(ExpectedConditions.visibilityOf(activityStream.checklistBtn));
        activityStream.checklistBtn.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.thingsToDo));
        activityStream.thingsToDo.sendKeys("sunshine");
        activityStream.addBtn.click();
        activityStream.thingsToDo.sendKeys("moonshine");
        activityStream.checkMark.click();
        Assert.assertEquals(activityStream.checklistItem1.getText().trim(), "sunshine");
        Assert.assertEquals(activityStream.checklistItem2.getText().trim(), "moonshine");
    }

    @Test
    public void addSeparator(){
        logInPage.logIn(ConfigurationReader.getProperty("hr2"), ConfigurationReader.getProperty("password"));
        wait.until(ExpectedConditions.visibilityOf(activityStream.tasks));
        activityStream.tasks.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.newTaskBtn));
        activityStream.newTaskBtn.click();
        driver.switchTo().frame(activityStream.iFrame2);
        wait.until(ExpectedConditions.visibilityOf(activityStream.checklistBtn));
        activityStream.checklistBtn.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.thingsToDo));
        activityStream.thingsToDo.sendKeys("sunshine");
        activityStream.addBtn.click();
        activityStream.separatorBtn.click();
        activityStream.thingsToDo.sendKeys("moonshine");
        activityStream.checkMark.click();
        Assert.assertTrue(activityStream.separatorLine.isDisplayed());
    }

    @Test
    public void deleteChecklistItem(){
        logInPage.logIn(ConfigurationReader.getProperty("hr2"), ConfigurationReader.getProperty("password"));
        wait.until(ExpectedConditions.visibilityOf(activityStream.tasks));
        activityStream.tasks.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.newTaskBtn));
        activityStream.newTaskBtn.click();
        driver.switchTo().frame(activityStream.iFrame2);
        wait.until(ExpectedConditions.visibilityOf(activityStream.checklistBtn));
        activityStream.checklistBtn.click();
        wait.until(ExpectedConditions.visibilityOf(activityStream.thingsToDo));
        activityStream.thingsToDo.sendKeys("sunshine");
        activityStream.addBtn.click();
        Assert.assertTrue(activityStream.xmark.isEnabled());
        activityStream.xmark.click();
    }

}
