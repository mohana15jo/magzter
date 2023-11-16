package org.magz;

import java.io.IOException;
import java.util.Date;

import org.Utilities.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.POM_Favourties;
import org.pom.POM_fav_to_cart;

import junit.framework.Assert;

public class magzter_Favourties extends BaseClass {

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
		String sh="Favourties";
		
	 	
	 	POM_Favourties fav=new POM_Favourties();
	 	//sign in first
	 	wait_VisibilityOf(fav.getSign_up());
		WebElement sign_up=fav.getSign_up();
		click_option(sign_up);
		//email
		WebElement email=fav.getEmail();
		fill(email, getdata(filename,sh,1,0));
		//click continue
		WebElement continu=fav.getContin();
		click_option(continu);
		//static_wait(10000);
		wait_VisibilityOf(fav.getPassword());
		//password
		WebElement password=fav.getPassword();
		fill(password, getdata(filename,sh,1,1));
		
		//continue
		WebElement continu2=fav.getContinu2();
		click_option(continu2);
		
		wait_VisibilityOf(fav.getSearch_icon());
	 	//click search
		click_option(fav.getSearch_icon());

		click_option(fav.getEnglish());
		
		wait_VisibilityOf(fav.getSelection());
		click_option(fav.getSelection());
	
		wait_VisibilityOf(fav.getFavourt());
		javaScript_button(fav.getFavourt());
	
		wait_VisibilityOf(fav.getView());
		click_option(fav.getView());
		
		wait_VisibilityOf(fav.getMy_fav());
		click_option(fav.getMy_fav());

		wait_VisibilityOf(fav.getAddtoexcel());
		click_option(fav.getAddtoexcel());
		
		wait_VisibilityOf(fav.getList());
	//	click_option(fav.getList());
		String value=get_text(fav.getList());
		System.out.println(value);
		putdata(filename,sh,1,2,value);
		
		String title=get_Title();
		Assert.assertTrue("Check the page",title.contains("My Favorites") );
	}
}
