package org.magz;

import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.Utilities.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.POM_Login;
import org.pom.POM_add_to_cart;

import junit.framework.Assert;

public class magzter_addToCart extends BaseClass {
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
		String sh="add_To_Cart";
		
	 	
	 	POM_add_to_cart add=new POM_add_to_cart();
	 	
	 	//sign in first
	 	wait_VisibilityOf(add.getSign_up());
		WebElement sign_up=add.getSign_up();
		click_option(sign_up);
		
		//email
		WebElement email=add.getEmail();
		fill(email, getdata(filename,sh,1,0));
		
		//click continue
		WebElement continu=add.getContin();
		click_option(continu);
	
		wait_VisibilityOf(add.getPassword());
		//password
		WebElement password=add.getPassword();
		fill(password, getdata(filename,sh,1,1));
		
		//continue
		WebElement continu2=add.getContinu2();
		click_option(continu2);
	 	
		static_wait(6000);
	 	wait_VisibilityOf(add.getSearch_icon());
	 	//click search
		click_option(add.getSearch_icon());
		
		//click tamil mag
		click_option(add.getTamil());
		
		
		//click penmani
		WebElement penmani = add.getPenmani();
		wait_VisibilityOf(penmani);
		click_option(penmani);
		
		wait_VisibilityOf(add.getBuy());
		
		//click subcription
		javaScript_button(add.getBuy());
		//click add to cart
		WebElement add2 = add.getAdd();
		wait_VisibilityOf(add2);
		
		javaScript_button(add2);
		
		wait_VisibilityOf(add.getClose());
		click_option(add.getClose());
		
		wait_VisibilityOf(add.getToview());
	

		WebElement a=add.getAddtoexcel();
		String value=get_text(a);
		putdata(filename,sh,1,3,value);
		
		String title=get_Title();
		Assert.assertTrue("check the page", title.contains("Penmani"));
		System.out.println("");
	}

}
