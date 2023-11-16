package org.magz;

import java.io.IOException;
import java.util.Date;

import org.Utilities.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.POM_Login;

import junit.framework.Assert;

public class magzter_Login extends BaseClass{
	@BeforeClass
	public static void browseropen() {
		browser_launch();
		passurl("https://www.magzter.com/");

	}
	@Before
	public void start() {
		Date d=new Date();
		System.out.println("Start Time:"+d);
	}
	
	@After
	public void end() {
		Date d=new Date();
		System.out.println("End Time:"+d);

	}
	@Test
	public void tc1() throws IOException, InterruptedException
	{		
		String filename="C:\\Users\\Mohana\\eclipse-workspace\\Magzter_Project\\target\\magzter.xlsx";
		String sh="Login";
	 	
	 	
	 	POM_Login login=new POM_Login();
	 	wait_VisibilityOf(login.getSign_up());
		WebElement sign_up=login.getSign_up();
		click_option(sign_up);
		
		WebElement email=login.getEmail();
		fill(email, getdata(filename,sh,1,0));
		
		WebElement continu=login.getContin();
		click_option(continu);
		
		wait_VisibilityOf(login.getPassword());
		WebElement password=login.getPassword();
		fill(password, getdata(filename,sh,1,1));
		
		WebElement continu2=login.getContinu2();
		click_option(continu2);

		
		
	}
}