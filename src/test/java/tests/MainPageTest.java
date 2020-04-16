package tests;


import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.BrowserUtils;

public class MainPageTest extends AbstractTestBase {

    LoginPage loginPage = new LoginPage();
    MainPage messagePage = new MainPage();

    @Test
    public void Comment() {
        loginPage.login();

        messagePage.Comment();
        messagePage.enterMessageFrame();
        messagePage.sendMessage("Hello");


       // messagePage.SendButton();
        messagePage.LikeButton();
        messagePage.Follow();


        messagePage.ReviewersName();
        // messagePage.AddToFavorites();
    }


}