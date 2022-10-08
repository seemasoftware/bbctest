package TestBBC;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Utils{

    BrowserSelector browserSelector= new BrowserSelector();

    @Before
    public void setUp() {
        browserSelector.setUpBrowser();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            scenario.attach(screenshot, "C:\\Users\\sr_ta\\IdeaProjects\\BBCTest\\src\\test\\Resources\\Screenshot", screenshotName); //stick it in the report
        }

        browserSelector.closeBrowser();

    }
}
