package com.AD.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com/AD/steps"
		,dryRun=false

		,plugin= {"pretty"}
<<<<<<< HEAD

=======
=======
		,plugin= {	"pretty"}
<<<<<<< HEAD
>>>>>>> 4e0bf45af7ddacabde47e85900c2433343813790
=======
>>>>>>> 7f7024d776726b01f8ce2492883d162469da5fb0
>>>>>>> 9ce70e256405b2a6b4a49cb06d915504f8a75cc5
>>>>>>> b1
		,monochrome=true
		,tags= "@smoke"
		)

public class SmokeRunner {

}
