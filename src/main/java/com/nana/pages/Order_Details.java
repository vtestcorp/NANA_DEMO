package com.nana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nana.base.BaseClass;

public class Order_Details extends BaseClass {

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.exa.nanamarket.preproduction:id/edit_order_button']")
	public WebElement edit_Order;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Edit order items']")
	public WebElement edit_Order_Items;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Cancel order']")
	public WebElement cancel_Order;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Try App']")
	public WebElement try_App;
	
	

}
