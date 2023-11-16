package org.pom;

import org.Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Search extends BaseClass{
	public POM_Search() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="(//img[@title=\"Search\"])[2]")
	private WebElement search_icon;
	
	@FindBy(name="word")
	private WebElement search_tab;
	
	@FindBy(xpath="//li[text()=\\\"Magazines\\\"]")
	private WebElement search_mag;

	@FindBy(xpath="//li[text()=\\\"Discover\\\"]")
	private WebElement search_story;
	
	@FindBy(id="wzrk-confirm")
	private WebElement update;
	
	@FindBy(xpath="(//img[@alt=\"Business Standard\"])[1]")
	private WebElement paper;
	
	public WebElement getPaper() {
		return paper;
	}

	public WebElement getSearch_story() {
		return search_story;
	}

	public WebElement getSearch_discover() {
		return search_discover;
	}
	@FindBy(xpath="//li[text()=\\\"Stories\\\"]")
	private WebElement search_discover;
	
	public WebElement getSearch_icon() {
		return search_icon;
	}

	public WebElement getSearch_tab() {
		return search_tab;
	}

	public WebElement getSearch_mag() {
		return search_mag;
	}
	
	public WebElement getUpdate() {
		return update;
	}
	
	
	

}
