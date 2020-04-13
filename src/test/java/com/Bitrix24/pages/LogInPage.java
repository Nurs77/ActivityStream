package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage () {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (name = "USER_LOGIN")
    public WebElement username ;

    @FindBy (name = "USER_PASSWORD")
    public WebElement password;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement logInBtn;

    public void logIn (String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        logInBtn.click();

    }


}
