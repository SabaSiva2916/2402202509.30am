package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\Windows\\eclipse-workspace\\SampleMavenJan6\\src\\test\\resources\\Feature\\Login.feature" }, glue = {
				"org.stepdef" })
public class TestRunner {


	
}
