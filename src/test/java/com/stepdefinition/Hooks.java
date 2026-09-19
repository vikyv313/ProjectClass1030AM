package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void beforeScenario() {
		System.out.println("Before");
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
	}
	
	@After
	public void afterScenario(Scenario s) {
		TakesScreenshot tk = (TakesScreenshot)driver;
		byte[] b = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(b, "Facebook.png");
		quitBrowser();
	}
}
