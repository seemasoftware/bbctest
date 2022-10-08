package TestBBC;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = ".",tags ="@todo1", plugin = {"pretty","html:target/cucumber-reports.html"})


public class Runner {
}
