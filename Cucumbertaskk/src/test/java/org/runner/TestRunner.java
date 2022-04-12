package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", dryRun = false, glue = "org.stepdefnition", 
                 monochrome = true,tags= {"@sc1"}, plugin = {
		                                    "html:target", 
		                                    "json:target/report.json"})

public class TestRunner {

}
