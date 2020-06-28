package com.nana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nana.base.BaseClass;

public class Hyper_Panda extends BaseClass {

	@FindBy(xpath = "//android.widget.TextView[@text='Flash Deals']")
	public WebElement flash_Deals;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Meat & poultry']")
	public WebElement Meat_Poultary;

	public Hyper_Panda() {
		PageFactory.initElements(getDriver(), this);
	}

}
