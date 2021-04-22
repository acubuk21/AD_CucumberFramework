package com.AD.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com/AD/steps"
		,dryRun=false
<<<<<<< HEAD
		,plugin= {"pretty"}
=======
		,plugin= {	"pretty"}
>>>>>>> 7f7024d776726b01f8ce2492883d162469da5fb0
		,monochrome=true
		,tags= "@smoke"
		)

public class SmokeRunner {

}
