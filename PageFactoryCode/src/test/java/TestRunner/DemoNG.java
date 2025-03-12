package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Feature\\Sample3.feature",
glue= {"StepDefinition","Hooks"},
plugin= {"pretty","html:target/CucumberReport/report4.html"},
//tags=("@SmokeTest or @SystemTest"),
monochrome=true)
public class DemoNG extends AbstractTestNGCucumberTests{

}
