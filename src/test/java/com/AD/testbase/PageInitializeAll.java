package com.AD.testbase;


import com.AD.pages.LoginPageElements;

public class PageInitializeAll extends BaseClass {
	
	protected static LoginPageElements login;
	
	public static void initializeAll() {
		login = new LoginPageElements();
		

	}
}


