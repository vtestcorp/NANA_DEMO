package com.nana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nana.base.BaseClass;

public class Shopping_Cart extends BaseClass {

	@FindBy(xpath = "//android.widget.TextView[@text='Process to Checkout']")
	public WebElement Process_To_Checkout;

}
