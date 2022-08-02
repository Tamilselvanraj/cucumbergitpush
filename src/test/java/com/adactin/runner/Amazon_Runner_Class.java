package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class_Adactin;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\amazon.feature",
glue="src.test.jav.com.adactin.stepdefinition.Amazon_Step_Definition.java", monochrome = true)
public class Amazon_Runner_Class {
	
	public static WebDriver driver;
	@BeforeClass
	
	public static void setUp() {
		driver=Base_Class_Adactin.browerLaunch("chrome");
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
