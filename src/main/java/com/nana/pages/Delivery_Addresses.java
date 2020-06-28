package com.nana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nana.base.BaseClass;

public class Delivery_Addresses extends BaseClass {
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.exa.nanamarket.preproduction:id/edit_order_button']")
	public WebElement edit_Order;
	
}
