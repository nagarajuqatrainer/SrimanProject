package stepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\test\\resources\\Features\\validLogin.feature", // Remove "./" for clarity
        glue = {"stepDefinitions","appHooks"},
//        tags = "@RegressionTest or @SmokeTest", // Space before "@" is unnecessary
//        plugin = {
//                "pretty", 
////                "html:target/cucumber-reports/Cucumber.html", 
////                "json:target/cucumber-reports/Cucumber.json", 
////                "junit:target/cucumber-reports/Cucumber.xml", 
////                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        },
        dryRun = false,
        monochrome = true // Set true for better console output readability
)

public class TestRunner extends AbstractTestNGCucumberTests {
    // No additional code needed unless custom setup is required
}
