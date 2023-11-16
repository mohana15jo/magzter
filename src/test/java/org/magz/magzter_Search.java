package org.magz;

import java.io.IOException;
import java.util.Date;

import org.Utilities.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pom.POM_Register;
import org.pom.POM_Search;

public class magzter_Search extends BaseClass{

	
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
		
	 	static_wait(6000);
	 	String filename="C:\\Users\\Mohana\\eclipse-workspace\\Magzter_Project\\target\\magzter.xlsx";
		String sh="Search";
	 	POM_Search search=new POM_Search();
	 	
	 	//click the search icon
	 	click_option(search.getSearch_icon());
	
	 	//Enter the data to search
	 	fill(search.getSearch_tab(),getdata(filename, sh, 1, 0));
	
	 	static_wait(5000);
	// 	click_option(search.getUpdate());
	 	
	 	click_option(search.getPaper());
	}
	
}
