package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends BaseClass{
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderID;
	@FindBy(id="search_hotel")
	private WebElement searchHotels;
	public WebElement getOrderID() {
		return orderID;
	}
	public WebElement getSearchHotel() {
		return searchHotels;
	}
public void bookingConfirm() {
	String value = getAttribute(getOrderID());
	System.out.println(value);
	btnclick(getSearchHotel());
}
}
