package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

    public static WebDriver creatDriver(String browserName) {
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().version("79").setup();
            return new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browserName.equals("opera")){
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        }else if (browserName.equals("edge")){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }else {
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        }
    }

//
//    ChromeOptions chromeOptions = new ChromeOptions();
//    //headless mode makes execution twice faster
//    //it does everything except file uploading
//    //set it to tru to make it work
//        chromeOptions.setHeadless(false);//to run browser without GUI. Makes browser invisible.
}
