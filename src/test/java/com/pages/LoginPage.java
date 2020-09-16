package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public	LoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement txtuser;
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(id="login")
	private WebElement btnlogin;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
public void login(String name, String pass) {
	type(getTxtuser(), name);
	type(getTxtpass(), pass);
	btnclick(getBtnlogin());
}
}
