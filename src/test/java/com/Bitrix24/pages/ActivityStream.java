package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStream {
    public ActivityStream(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id="feed-add-post-form-tab-calendar")
    public WebElement event;

    @FindBy (xpath = "(//span[@title='Link']/i)[2]")
    public WebElement uploadLinkBtn;

    @FindBy (xpath = "//input[@placeholder='Link text']")
    public WebElement linkText;

    @FindBy (xpath = "//input[@placeholder='Link URL']")
    public WebElement linkLink;

    @FindBy (xpath = "//input[@value='Save']")
    public WebElement saveBtn;

    @FindBy (xpath = "//body/a")
    public WebElement link;

    @FindBy (xpath = "(//iframe[@class='bx-editor-iframe'])[2]")
    public WebElement iFrame;








}
