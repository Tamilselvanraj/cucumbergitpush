Feature: Hotel Booking Application
Scenario: Login Page
Given user Launch The Url
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Clicks The Login Button And Navigate To Search Hotel Page

Scenario: User Search The Hotel
When users Select The Location In Location DropDown Field
And users Select The Hotles In Hotel DropDown Field
And uers Select The Room Type In RoomType DropDown Field
And users Select The Number Of Rooms From Number Of Rooms DropDown Field
And users Enter The Check In Date In Check In Date Field
And users Enter The Check Out In Check Out Date Field
And users Select The Adults Per Room In Adults Per Room Field
And users Select The Childrens Count Per Room In Childres Per Room Field
Then users Click The Search Button And Navigate To Select Hotel Page

Scenario: User Select The Hotel
When users Clicks The Radio Button 
Then users Clicks The Continue Button And Navigate To Book Hotel Page

Scenario: User Book A Hotel
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In "Billing Address" Field
And user Enter The Card Number In "1234567891234567" In Field
And user Select The Credit Card Type In DropDown Field Credit Card Type
And user Select Expiry Date Month And Year In Month And Year DropDown Field
And user Enter The Cvv Number In "321" In Field
Then user Click The Book Now Button And Wait For Confirmation

Scenario: User Log Out The Adactin Hotel Page
Then user Click The Log Out Button And Exit From The Hotel Booking Application


