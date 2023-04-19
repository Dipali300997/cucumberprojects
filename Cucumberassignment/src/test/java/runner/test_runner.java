package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.CucumberOptions;
@RunWith (Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\login\\guru99login.feature"},glue = {"definition"},tags = "@PositiveTesting",plugin = ("html:report/myreport.html"))
public class test_runner {

}
