package com.nana.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.nana.base.BaseClass;
import com.nana.pages.LoginPage;

public class TC007_Add_New_Address extends BaseClass {
	LoginPage login;
	

	public TC007_Add_New_Address() {
		super();
	}

	@Test
	public void add_New_Address() throws Exception {
		click_Hyper_Panda();

	}

	public void click_Hyper_Panda() throws InterruptedException {
		login = new LoginPage();
		getDriver().manage().timeouts().implicitlyWait(15000L, TimeUnit.SECONDS);
		login.Change_Store.click();

	}

}