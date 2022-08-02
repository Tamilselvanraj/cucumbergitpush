package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class_Adactin;
import com.adactin.runner.Amazon_Runner_Class;

import io.cucumber.java.en.Given;

public class Amazon_Step_Definition extends Base_Class_Adactin {

	public static WebDriver driver=Amazon_Runner_Class.driver;
	
//	@Given("user Launch The Url In Browser")
//	public void user_launch_the_url_in_browser() throws InterruptedException {
//		getUrl("https://www.amazon.in/");
//		sleep();
//	}

	@Given("user Launch The Url In Browser")
	public static void user_launch_the_url_in_browser() {
		driver.get("https://www.amazon.in/");
	}
	
}
