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
>>>>>>> 4e0bf45af7ddacabde47e85900c2433343813790
		,monochrome=true
		,tags= "@smoke"
		)

public class SmokeRunner {

}
