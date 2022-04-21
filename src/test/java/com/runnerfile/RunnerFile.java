package com.runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","json:target/cucumber.json" },
		features= {".//FeatureFiles"},
		glue= {"com.test.stepdefs"},
		dryRun= false,
		monochrome=	true	
		)


public class RunnerFile extends AbstractTestNGCucumberTests {

}
