package com.adactin.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Base_Class_Adactin;
import com.adactin.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition extends Base_Class_Adactin{
	public static WebDriver driver=RunnerClass.driver;
	
	@Given("^user Launch The Url$")
	public static void user_Launch_The_Url() {
		//getUrl("https://adactinhotelapp.com/");
		driver.get("https://adactinhotelapp.com/");
		implecitylyWait();
   	}

	@When("^user Enter The Username In Username Field$")
	public static void user_Enter_The_Username_In_Username_Field() throws InterruptedException {
		WebElement username=driver.findElement(By.id("username"));
		inputValue(username, "durgakumar");
		sleep();
	}

	@When("^user Enter The Password In Password Field$")
	public static void user_Enter_The_Password_In_Password_Field() {
		WebElement password=driver.findElement(By.id("password"));
		inputValue(password, "O1717K");
	}

	@Then("^user Clicks The Login Button And Navigate To Search Hotel Page$")
	public static void user_Clicks_The_Login_Button_And_Navigate_To_Search_Hotel_Page() throws InterruptedException {
		WebElement login=driver.findElement(By.id("login"));
		click(login);
		Thread.sleep(3000);
	}

	@When("users Select The Location In Location DropDown Field")
	public void users_select_the_location_in_location_drop_down_field() {
		WebElement location=driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByValue("Sydney");
	}
	
	@When("users Select The Hotles In Hotel DropDown Field")
	public void users_select_the_hotles_in_hotel_drop_down_field() {
		WebElement hotel=driver.findElement(By.id("hotels"));
		Select s2=new Select(hotel);
		s2.selectByVisibleText("Hotel Sunshine");
	}
	
	@When("uers Select The Room Type In RoomType DropDown Field")
	public void uers_select_the_room_type_in_room_type_drop_down_field() {
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s3=new Select(roomType);
		s3.selectByValue("Deluxe");
	}
	
	@When("users Select The Number Of Rooms From Number Of Rooms DropDown Field")
	public void users_select_the_number_of_rooms_from_number_of_rooms_drop_down_field() {
		WebElement noOfRooms=driver.findElement(By.id("room_nos"));
		Select s4=new Select(noOfRooms);
		s4.selectByValue("2");
	}
	
	@When("users Enter The Check In Date In Check In Date Field")
	public void users_enter_the_check_in_date_in_check_in_date_field() {
		WebElement checkInDate=driver.findElement(By.id("datepick_in"));
		checkInDate.clear();
		checkInDate.sendKeys("25/07/2022");
	}
	@When("users Enter The Check Out In Check Out Date Field")
	public void users_enter_the_check_out_in_check_out_date_field() {
		WebElement checkOutDate=driver.findElement(By.id("datepick_out"));
		checkOutDate.clear();
		checkOutDate.sendKeys("27/07/2022");
	}
	@When("users Select The Adults Per Room In Adults Per Room Field")
	public void users_select_the_adults_per_room_in_adults_per_room_field() {
		WebElement adultRoom=driver.findElement(By.id("adult_room"));
		Select s5=new Select(adultRoom);
		s5.selectByVisibleText("3 - Three");
	}
	
	@When("users Select The Childrens Count Per Room In Childres Per Room Field")
	public void users_select_the_childrens_count_per_room_in_childres_per_room_field() {
		 WebElement childrenRoom=driver.findElement(By.id("child_room"));
		    Select s6=new Select(childrenRoom);
		    s6.selectByValue("2");
	}
	
	@Then("users Click The Search Button And Navigate To Select Hotel Page")
	public void users_click_the_search_button_and_navigate_to_select_hotel_page() {
	    WebElement submit=driver.findElement(By.id("Submit"));
	    submit.click();
	}
	
	@When("users Clicks The Radio Button")
	public void users_clicks_the_radio_button() {
	    WebElement radioButton=driver.findElement(By.id("radiobutton_0"));
	    radioButton.click();
	}
	@Then("users Clicks The Continue Button And Navigate To Book Hotel Page")
	public void users_clicks_the_continue_button_and_navigate_to_book_hotel_page() {
	    WebElement continueNext=driver.findElement(By.id("continue"));
	    continueNext.click();
	}
	
	@When("user Enter The First Name In First Name Field")
	public void user_enter_the_first_name_in_first_name_field() {
	   WebElement firstName=driver.findElement(By.id("first_name"));
	   firstName.sendKeys("Tamilselvan");
	}
	@When("user Enter The Last Name In Last Name Field")
	public void user_enter_the_last_name_in_last_name_field() {
	    WebElement lastName=driver.findElement(By.id("last_name"));
	    lastName.sendKeys("Raj");
	}
	@When("user Enter The Billing Address In {string} Field")
	public void user_enter_the_billing_address_in_field(String addr) {
	    WebElement billAddress=driver.findElement(By.id("address"));
	    billAddress.sendKeys(addr);
	}
	@When("user Enter The Card Number In {string} In Field")
	public void user_enter_the_card_number_in_in_field(String ccno) {
	   WebElement creditCardNo=driver.findElement(By.id("cc_num"));
	   creditCardNo.sendKeys(ccno);
	}
	@When("user Select The Credit Card Type In DropDown Field Credit Card Type")
	public void user_select_the_credit_card_type_in_drop_down_field_credit_card_type() {
	   WebElement ccType=driver.findElement(By.id("cc_type"));
	   Select s7=new Select(ccType);
	   s7.selectByValue("VISA");
	}
	@When("user Select Expiry Date Month And Year In Month And Year DropDown Field")
	public void user_select_expiry_date_month_and_year_in_month_and_year_drop_down_field() {
	    WebElement expMonth=driver.findElement(By.id("cc_exp_month"));
	    Select s8=new Select(expMonth);
	    s8.selectByIndex(5);
	    
	    WebElement expYear=driver.findElement(By.id("cc_exp_year"));
	    Select s9=new Select(expYear);
	    s9.selectByValue("2022");
	}
	@When("user Enter The Cvv Number In {string} In Field")
	public void user_enter_the_cvv_number_in_in_field(String cvvno) {
	    WebElement cvvNumber=driver.findElement(By.id("cc_cvv"));
	    cvvNumber.sendKeys(cvvno);
	}
	
	@Then("user Click The Book Now Button And Wait For Confirmation")
	public void user_click_the_book_now_button_and_wait_for_confirmation() throws InterruptedException {
	    WebElement bookNow=driver.findElement(By.id("book_now"));
	    bookNow.click();
	    Thread.sleep(2000);
	}

	@Then("user Click The Log Out Button And Exit From The Hotel Booking Application")
	public void user_click_the_log_out_button_and_exit_from_the_hotel_booking_application() {
	    WebElement logOut=driver.findElement(By.id("logout"));
	    logOut.click();
	}
}
