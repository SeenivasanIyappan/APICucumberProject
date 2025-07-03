package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",
    glue = {"stepDefinations"},
    plugin = {
        "pretty",                                           // Console output
        "html:reports/cucumber-reports/CucumberReport.html", // Basic Cucumber HTML report
        "json:reports/cucumber-reports/CucumberReport.json", // JSON report
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // Extent report
    },
    monochrome = true
)
public class TestRunner {
}

