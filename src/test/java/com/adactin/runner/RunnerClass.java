package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.Base_Class_Adactin;


//@RunWith(Cucumber.class)
//@CucumberOptions(features="src//test//java//com//adactin//feature",
//glue="com.adactin.stepdefinition",
//monochrome=true)

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(features="src//test//java//com//adactin//feature",
glue="com.adactin.stepdefinition",
monochrome = true,
plugin = {"pretty","html:Reports/report.html","junit:Reports/report.xml","json:Reports/report.json"})
public class RunnerClass{
 public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\eclipse-workspace\\AdactinCucumber\\Driver\\chromedriver.exe");
	//	driver=new ChromeDriver();
		driver = Base_Class_Adactin.browerLaunch("chrome");
	
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
		
	}
}
