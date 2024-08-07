package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\jagad\\eclipse-workspace\\Sample1\\Project_Cucumber\\"
		+ "src\\test\\java\\org\\app\\feature\\LoginPage.feature",
		glue = "stepdefinition",
		dryRun = false)
		
		
		

public class Runner {
}
