package testrunnerrework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\resources\\login\\login.feature"},glue = {"definition"},tags = "@PositiveTesting")

public class TestRunnerReworkClass extends AbstractTestNGCucumberTests{

}
