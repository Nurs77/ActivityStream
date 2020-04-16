package com.Bitrix24.utilities;

import Utilities.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrowserUtils {

    public  static  void wait(int second){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<String>getTextWeb(List<WebElement>elements){
        List<String>textValues = new ArrayList<>();
        for (WebElement element:elements){
            if (!element.getText().isEmpty()) {
                textValues.add(element.getText());
            }
        }
        return textValues;
    }


    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(Utilities.Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }

    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Utilities.Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Utilities.Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    public static void scrollTo(WebElement element) {
        ((JavascriptExecutor) Utilities.Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }



    public static String getScreenshot(String name){
        name = new Date().toString()+ "_"+ name;
        String path = System.getProperty("user.dir")+"/test-output/screenshots/"+ name +".phg";
        System.out.println("Screenshot is here " + path);
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        //take screenshot of web browser save it as file
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        //where screenshot will be saved
        File destination = new File(path);
        try {
            FileUtils.copyFile(source,destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;


    }
}
