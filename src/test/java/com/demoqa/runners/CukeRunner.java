package com.demoqa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json","html:target/cucumber-report.html",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources",
        glue="com/demoqa/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukeRunner {
}
