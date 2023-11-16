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
import org.pom.POM_Register;

import junit.framework.Assert;

public class magzter_Register extends BaseClass{
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
		String sh="Register";
	 	POM_Register reg=new POM_Register();
		//click sign up
	 	wait_VisibilityOf(reg.getSign_up());
	 	WebElement sign_up=reg.getSign_up();
		click_option(sign_up);
		
		wait_VisibilityOf(reg.getEmail());
		//Enter the email id
		fill(reg.getEmail(),getdata(filename, sh, 3, 0));
		
		//click continue
		click_option(reg.getContin());

		wait_VisibilityOf(reg.getFullname());
		//Enter the full name
		fill(reg.getFullname(),getdata(filename,sh,3,1));
		
		
		//Enter the password
		fill(reg.getPassword(),getdata(filename, sh,3, 2));
		
		//Click continue
		click_option(reg.getCreate_account());
		
		wait_VisibilityOf(reg.getView());
		click_option(reg.getView());
		
		wait_VisibilityOf(reg.getMy_profile());
		click_option(reg.getMy_profile());
		
		String title=get_Title();
		Assert.assertTrue("Check the page",title.contains("Myprofile") );
	
	}
}