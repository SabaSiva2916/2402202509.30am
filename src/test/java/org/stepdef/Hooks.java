package org.stepdef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
WebDriver driver;
	@Before
	public void beforeScenrio() {
		System.out.println("Before Scenrio");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("Before step execution");

	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("After each step");

	}

	@After
	public void afterScenario(Scenario s) {
		if (s.isFailed()) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		
		s.attach(screenshotAs, ".png", s.getName());
				
		}

	}

}
