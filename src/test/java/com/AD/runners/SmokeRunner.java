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
		,plugin= {	"pretty"}
=======

		,plugin= {"pretty"}

>>>>>>> e5486a1addad1641b7e4dcb055fba3823120bc2f
		,monochrome=true
		,tags= "@smoke"
		)

public class SmokeRunner {

}
