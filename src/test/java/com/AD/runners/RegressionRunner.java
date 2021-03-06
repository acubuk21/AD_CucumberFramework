package com.AD.runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com/AD/steps"
		,dryRun=false
		,plugin= {"pretty", "html:target/html/cucumber-default-report"}
		,monochrome=true
		,tags= {"@regression"}
		)

public class RegressionRunner {

}
