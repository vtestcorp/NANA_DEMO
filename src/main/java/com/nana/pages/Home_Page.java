package com.nana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nana.base.BaseClass;

public class Home_Page  extends BaseClass {

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.exa.nanamarket.preproduction:id/cart']")
	public WebElement cart;
}
