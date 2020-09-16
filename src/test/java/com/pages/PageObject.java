package com.pages;

public class PageObject extends BaseClass {
	public static PageObject pageObject;	
	private PageObject() {}
	private LoginPage loginPage;
	private Search search;
	private SelectHotel selectHotel;
	private BookHotel bookHotel;
	private BookingConfirm bookingConfirm;
	public static PageObject getinstance() {
		return (pageObject==null)? pageObject = new PageObject():pageObject;
	}
	public LoginPage getLoginpage() {
		return (loginPage==null)? loginPage = new LoginPage():loginPage;
	}
	public Search getSearch() {
		return (search==null)? search = new Search():search;
	}
	public SelectHotel getSelecthotel() {
		return (selectHotel==null)? selectHotel= new SelectHotel():selectHotel;
	}
	public BookHotel getBookhotel() {
		return (bookHotel==null)? bookHotel= new BookHotel():bookHotel;
	}
	public BookingConfirm getBookingconfirm() {
		return (bookingConfirm==null)? bookingConfirm= new BookingConfirm():bookingConfirm;
	}

}
  