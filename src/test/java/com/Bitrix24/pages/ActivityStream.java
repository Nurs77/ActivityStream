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

    @FindBy(id="bx_left_menu_menu_tasks")
    public WebElement tasks;

    @FindBy(id="tasks-buttonAdd")
    public WebElement newTaskBtn;

    @FindBy(className = "side-panel-iframe")
    public WebElement iFrame2;

    @FindBy(xpath="//span[@id='bx-b-mention-task-form-bitrix_tasks_task_default_1']/following-sibling::*")
    public WebElement checklistBtn;

    @FindBy(xpath="//span[@class='task-checklist-form-vpadding']/*[1]")
    public WebElement thingsToDo;

    @FindBy(xpath = "//div[@class='task-checklist-actions']/*[1]")
    public WebElement addBtn;

    @FindBy(xpath = "//span[@class='task-checklist-form-vpadding']/*[2]")
    public WebElement checkMark;

    @FindBy(xpath = "//div[@class='task-checklist-title']/following-sibling::*/*[4]//label/*[2]")
    public WebElement checklistItem1;

    @FindBy(xpath = "//div[@class='task-checklist-title']/following-sibling::*/*[5]//label/*[2]")
    public WebElement checklistItem2;

    @FindBy(xpath = "//div[@class='task-checklist-actions']/*[2]")
    public WebElement separatorBtn;

    @FindBy(xpath = "//div[@class='task-checklist-title']/following-sibling::*/*[5]")
    public WebElement separatorLine;

    @FindBy(xpath = "//div[@class='task-checklist-title']/following-sibling::*/*[4]//span[4]")
    public WebElement xmark;

//    @FindBy(xpath = "//div[@id='left-menu-more-btn']//span[contains(text(),'More...')]")
//    public WebElement moreBtn;
//
//    @FindBy(xpath = "//li[@id='bx_left_menu_menu_bizproc_sect']//span[contains(text(),'Workflows')]")
//    public WebElement workflowBtn;
//
//    @FindBy(xpath = "//span[contains(text(),'Workflows in Activity Stream')]")
//    public WebElement workflowInActivity;
//
//    @FindBy(xpath = "//a[contains(text(),'Leave Approval')]")
//    public WebElement leaveApproval;
//
//@FindBy(xpath = "//span[contains(text(),'Add')]")
//    public WebElement addLeave;
//
//@FindBy(xpath = "//tr//tr//tr//tr[2]//td[2]//img[1]")
//    public WebElement startDate;
//@FindBy(xpath = "//tr[3]//td[2]//img[1]")
//    public WebElement endDate;
//@FindBy(xpath = "//a[contains(text(),'15')]")
//    public WebElement anyStartDate;
//@FindBy(xpath = "//tr[3]//td[2]//img[1]")
//    public WebElement anyEndDate;
//@FindBy(xpath = "//select[@name='PROPERTY_88']")
//    public WebElement absenceType;
//@FindBy(xpath = "//option[contains(text(),'Absent without reason or official leave')]")
//    public WebElement anyReason;
//@FindBy(xpath = "//textarea[@name='PREVIEW_TEXT']")
//    public WebElement reasonText;
//@FindBy(xpath = "//input[@name='save']")
//    public WebElement btnSave;

    @FindBy(linkText = "Like")
    public WebElement likeBtn;
    @FindBy(linkText = "Comment")
    public WebElement commentBtn;
    @FindBy(tagName = "body")
    public WebElement body;
    @FindBy(className = "feed-add-post-buttons")
    public WebElement sendBtn;

    @FindBy(linkText = "Unfollow")
    public WebElement unfollowBtn;

    @FindBy(className = "feed-comments-block")
    public WebElement commentSection;












}
