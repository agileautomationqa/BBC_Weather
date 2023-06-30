package uk.co.bbc.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Hiral Yagnik
 * Project Name: BBC_Weather
 */

@CucumberOptions(features = "src/test/resources/features",
        glue = {"uk/co/bbc/steps"},
        tags = "@test",
        plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunCuke extends AbstractTestNGCucumberTests {
}
