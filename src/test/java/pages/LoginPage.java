package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage extends AbstractBasePage {


    @FindBy(css = "input[type='text']")
    private WebElement username;

    @FindBy(css = "input[type='password']")
    private WebElement password;

    @FindBy(css = "input[type='submit']")
    private WebElement login;

    @FindBy(linkText = "Forgot your password?")
    private WebElement forgatPassword;

    @FindBy(css = "[class='errortext']")
    private WebElement warningMessage;




    public String getWarningMessageText(){
        return warningMessage.getText();
    }

    public void login(String usernameValue, String passwordValue) {
        this.username.sendKeys(usernameValue);
        this.password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(3);

    }
    public void login(){
        this.username.sendKeys(ConfigurationReader.getProperty("marketing1"));
        this.password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(3);
    }


}