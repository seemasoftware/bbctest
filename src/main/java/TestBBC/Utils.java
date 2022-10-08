package TestBBC;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage{
    // Method to LunchBrowser
    public static void LunchBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sr_ta\\IdeaProjects\\BBCTest\\src\\test\\Resources\\chromedriver_win32");
        //Open The Browser
        driver = new ChromeDriver();
        //Maximise the browser Window
        driver.manage().window().fullscreen();
        //set implicitly for driver object.
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        //Open the website
        driver.get("https://www.bbc.co.uk/sounds/music");
    }

    public static String rendomDate() {
        DateFormat format = new SimpleDateFormat("ddMMyyHHMMss");
        return format.format(new Date());
    }

    // Assert method to verify URL
    public void validateURL(String expectedURL) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }


    // ScreenShot Method
    public void takeScreenShot(String filename) {

        //Convert Web Driver object to Take ScreenShot
        TakesScreenshot scrShot = ((TakesScreenshot)driver);

        //Call getScreenshot as method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move Image File to new destination
        File DestFile = new File("C:\\Users\\sr_ta\\IdeaProjects\\TestOpenHealth\\src\\test\\TestData\\Screeenshot" +filename +rendomDate() + ".png");

        //Copy file at destination

        try {
            FileUtils.copyFile(SrcFile, DestFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // Click on element method
    public void ClickElement(By by) {

        driver.findElement(by).click();
    }


}
