package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features="Features\\tag_demo.feature",glue= {"cucumber"},plugin= {"html:target/cucumber.html"},tags= {"@FunctionalTest","@SmokeTest"})

public class runnerclss {

}
