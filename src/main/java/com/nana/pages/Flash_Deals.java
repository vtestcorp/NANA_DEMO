package com.nana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nana.base.BaseClass;

public class Flash_Deals extends BaseClass {

	@FindBy(xpath = "//android.widget.TextView[@text='Omo Clothes Soap Active Concentrated Washing Machines Powder 3 KG']")
	public WebElement Omo_Clothes;

	@FindBy(xpath = "//android.widget.TextView[@text='Add to cart']")
	public WebElement Omo_Clothes_Add_To_Cart;

	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.exa.nanamarket.preproduction:id/back']")
	public WebElement back_Button;

	@FindBy(xpath = "//android.widget.TextView[@text='President Cheese Slices Cheddar 400 G']")
	public WebElement President_Cheese_Slices;

	@FindBy(xpath = "//android.widget.ImageView[@id='com.exa.nanamarket.preproduction:id/back_icon']")
	public WebElement back_Icon;

	// android.widget.ImageView[@resource-id='com.exa.nanamarket.preproduction:id/back_icon'
	// or @id='com.exa.nanamarket.preproduction:id/back_icon'][@index='0']

	public Flash_Deals() {
		PageFactory.initElements(getDriver(), this);
	}
}
