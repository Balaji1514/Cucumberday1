package com.pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends BaseClass{
	public Search() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement locations;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement rooms;
	@FindBy(id="datepick_in")
	private WebElement datepick;
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	@FindBy(id="adult_room")
	private WebElement adultperroom;
	@FindBy(id="child_room")
	private WebElement childperroom;
	@FindBy(id="Submit")
	private WebElement Submit;
	public WebElement getLocation() {
		return locations;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRooms() {
		return rooms;
	}
	public WebElement getDatepick() {
		datepick.clear();
		return datepick;
	}
	public WebElement getDatepickout() {
		datepickout.clear();
		return datepickout;
	}
	public WebElement getAdultperroom() {
		return adultperroom;
	}
	public WebElement getChildperroom() {
		return childperroom;
	}
	public WebElement getSubmit() {
		return Submit;
	}
public void searchHotel (String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) {
	type(getLocation(), arg1);
	type(getHotels(), arg2);
	type(getRoomType(), arg3);
	type(getRooms(), arg4);
	type(getDatepick(), arg5);
	type(getDatepickout(), arg6);
	type(getAdultperroom(), arg7);
	type(getChildperroom(), arg8);
	btnclick(getSubmit());
	
	
}

}
