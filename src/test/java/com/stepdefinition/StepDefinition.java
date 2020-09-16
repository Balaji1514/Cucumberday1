package com.stepdefinition;
import com.pages.BaseClass;
import com.pages.BookHotel;
import com.pages.BookingConfirm;
import com.pages.LoginPage;
import com.pages.PageObject;
import com.pages.Search;
import com.pages.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDefinition extends BaseClass {
	PageObject obj;
	@Given("^I am entering the Adactin hotel login webpage$")
	public void i_am_entering_the_Adactin_hotel_login_webpage() {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
	}
	@When("^I am giving the \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_am_giving_the(String arg1, String arg2) {
		PageObject obj = PageObject.getinstance();
		LoginPage login = obj.getLoginpage();
		login.login(arg1, arg2);
	}
	@Given("^I am entering the Adactin hotel app home page$")
	public void i_am_entering_the_Adactin_hotel_app_home_page() {
	}
	@When("^user enter the \"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_enter_the(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8)  {
		PageObject obj = PageObject.getinstance();
		Search s = obj.getSearch();
		s.searchHotel(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
	@When("^user should select the hotel from the webtable$")
	public void user_should_select_the_hotel_from_the_webtable() {
		PageObject obj = PageObject.getinstance();
		SelectHotel select = obj.getSelecthotel();
		select.selectHotel();
	}
	@When("^user entering personal details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_entering_personal_details(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8)  {
		PageObject obj = PageObject.getinstance();
		BookHotel bookhotel = obj.getBookhotel();
		bookhotel.bookHotel(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
	@Then("^click search hotel button$")
	public void click_search_hotel_button()  {
		PageObject obj = PageObject.getinstance();
		BookingConfirm confirm = obj.getBookingconfirm();
		confirm.bookingConfirm();
	}
}
