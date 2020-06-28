package com.nana.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.nana.base.BaseClass;
import com.nana.pages.Flash_Deals;
import com.nana.pages.Home_Page;
import com.nana.pages.Hyper_Panda;
import com.nana.pages.LoginPage;
import com.nana.pages.Meat_Poultary;
import com.nana.pages.Order_Details;
import com.nana.pages.Send_Order;
import com.nana.pages.Shopping_Cart;

public class TC004_Delete_Order extends BaseClass {
	LoginPage login;
	Hyper_Panda hyper_Panda;
	Flash_Deals flash_Deals;
	Meat_Poultary meat_Poultary;
	Home_Page home_Page;
	Shopping_Cart shopping_Cart;
	Order_Details order_Details;
	Send_Order send_Order;

	public TC004_Delete_Order() {
		super();
	}

	@Test
	public void Place_Delete_Order() throws Exception {
		click_Hyper_Panda();
		click_Flash_Deals();
		click_Omo_Clothes();
		select_Products_From_Meat_Poultary();
		complete_CheckOut();
		Delete_Order();
	}

	public void click_Hyper_Panda() throws InterruptedException {
		login = new LoginPage();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		login.Hyper_Panda.click();

	}

	public void click_Flash_Deals() throws InterruptedException {
		hyper_Panda = new Hyper_Panda();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		hyper_Panda.flash_Deals.click();

	}

	public void click_Omo_Clothes() throws InterruptedException {
		flash_Deals = new Flash_Deals();
		hyper_Panda = new Hyper_Panda();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		flash_Deals.Omo_Clothes.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		Thread.sleep(15000L);
		flash_Deals.Omo_Clothes_Add_To_Cart.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		flash_Deals.back_Button.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		hyper_Panda.Meat_Poultary.click();

	}

	public void select_Products_From_Meat_Poultary() throws InterruptedException {
		meat_Poultary = new Meat_Poultary();
		home_Page = new Home_Page();
		// WebDriverWait wait = new WebDriverWait(getDriver(), 15000L);
		// wait.until(ExpectedConditions.elementToBeClickable(meat_Poultary.Entaj_Chicken_Legs_500_G));;
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		meat_Poultary.Entaj_Chicken_Legs_500_G.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		flash_Deals.Omo_Clothes_Add_To_Cart.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		flash_Deals.back_Button.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		home_Page.cart.click();

	}

	public void complete_CheckOut() throws InterruptedException {
		shopping_Cart = new Shopping_Cart();
		send_Order = new Send_Order();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		shopping_Cart.Process_To_Checkout.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		send_Order.cash_Payment_Method.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		send_Order.Send_Order.click();
	}

	public void Delete_Order() throws InterruptedException {
		order_Details = new Order_Details();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		order_Details.cancel_Order.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		order_Details.try_App.click();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		order_Details.cancel_Order.click();
	}
}