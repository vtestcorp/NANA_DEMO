package com.nana.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nana.base.BaseClass;

public class Meat_Poultary extends BaseClass {

	@FindBy(xpath = "//android.widget.TextView[@text='Entaj Chicken Legs 500 G']")
	public WebElement Entaj_Chicken_Legs_500_G;
}
