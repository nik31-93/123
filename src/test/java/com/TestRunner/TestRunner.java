package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"featureFile/xyz.feature"},
		glue={"com.StepDefination"},
		monochrome=true,
		dryRun=false,
		plugin={"html:target/abc.html", 
				"json:target/xyz.json",
				"junit:target/pqr.xml",
				"pretty:target/abc.txt"},
		tags="@tag2 or @tag3"
		)


public class TestRunner {

}