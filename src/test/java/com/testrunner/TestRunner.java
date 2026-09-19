package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",snippets = SnippetType.CAMELCASE,glue = "com.stepdefinition",
dryRun = false,plugin ={"pretty", "junit:target\\Facebook.xml",
								  "html:target\\Facebook.html",
								  "json:target\\Facebook.json"})
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		JVMReports.generateJvmReports("C:\\Users\\DELL\\eclipse-workspace\\Greens\\FrameWork11AM\\target\\Facebook.json");
	}
}
