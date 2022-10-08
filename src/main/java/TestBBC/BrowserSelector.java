package TestBBC;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelector extends Utils {
    LoadProps loadProps = new LoadProps();

    //Lunch Browser
    public void setUpBrowser() {
        String browser = LoadProps.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sr_ta\\IdeaProjects\\BBCTest\\src\\test\\Resources\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else
        {
            System.out.println("Browser name is empty or typed wrong:"+browser);
        }
    }

    //close the browser method
    public void closeBrowser() {
        driver.quit();
    }
}
