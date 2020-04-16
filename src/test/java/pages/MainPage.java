package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.BrowserUtils;
import utilities.Driver;

public class MainPage extends AbstractBasePage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //    @FindBy(xpath="//*[@id='blog-post-addc-add-661']")
    // private WebElement comment;
    @FindBy(linkText = "Comment")
    private WebElement comment;

    @FindBy(xpath = "//button[@id='lhe_button_cancel_blogCommentFormFVx7']")
    public WebElement cancel;


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    private WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    private WebElement commentText;


    @FindBy(xpath = "//button[contains(text(),'SEND')]")
    private WebElement sendButton;

    @FindBy(linkText = "Like")
    private WebElement like;

    @FindBy(xpath = "//*[@id='log_entry_follow_1975']/a")
    private WebElement follow;
    @FindBy(linkText = "Unfollow")
    private WebElement unfollow;

    @FindBy(linkText = "helpdesk47@cybertekschool.com")
    private WebElement reviewerName;

    @FindBy(linkText = "helpdesk47@cybertekschool.com")
    private WebElement reviewerProfile;

    @FindBy(xpath = "//*[@id='log_entry_favorites_1975']")
    private WebElement starIcon;


    public void Comment() {
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(comment)).click();


    }

    public void enterMessageFrame() {

    }

    public void sendMessage(String message) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
        commentText.sendKeys(message);
        driver.switchTo().parentFrame();
        String url = driver.getTitle();
        System.out.println(url);
        BrowserUtils.wait(2);


    }

    public void SendButton() {
        //wait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
        sendButton.click();
    }


    public void LikeButton() {
        BrowserUtils.wait(3);
        like.click();

    }

    public void Follow() {
        BrowserUtils.wait(4);
        follow.click();


    }


    public void ReviewersName() {
        BrowserUtils.wait(3);
        reviewerName.click();
        // Assert.assertTrue(reviewerName.isDisplayed());
        // Assert.assertTrue(reviewerProfile.isDisplayed());

    }

    public void AddToFavorites() {
        BrowserUtils.wait(3);
        starIcon.click();
    }

}

