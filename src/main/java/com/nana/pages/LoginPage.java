package com.nana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nana.base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//android.widget.TextView[@index='0'][@text='Hyper Panda']")
	public WebElement Hyper_Panda;

	@FindBy(xpath = "//android.widget.ImageView[@index='0'][@text='com.exa.nanamarket.preproduction:id/change_store']")
	public WebElement Change_Store;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

}
