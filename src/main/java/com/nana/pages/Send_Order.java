package com.nana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nana.base.BaseClass;

public class Send_Order extends BaseClass {

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.exa.nanamarket.preproduction:id/product_image']")
	public WebElement cash_Payment_Method;
	
	
	@FindBy(xpath = "//android.widget.Button[@resource-id='com.exa.nanamarket.preproduction:id/button_send_order' or @text='Send Order']")
	public WebElement Send_Order;
}
