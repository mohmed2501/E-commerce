package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import static org.testng.reporters.jq.BasePanel.C;

@CucumberOptions
        (
                features = "C:\\Users\\Mohamed Ali\\IdeaProjects\\ecommerce\\src\\main\\resources\\features",
                glue="org.example.stepDefs",
                tags = "@smoke",
                plugin = { "pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cukes.xml",
                        "rerun:target/rerun.txt"}
        )

public class runners extends AbstractTestNGCucumberTests {

}
