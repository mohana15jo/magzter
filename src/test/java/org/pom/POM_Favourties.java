package org.pom;

import org.Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Favourties extends BaseClass
{
	public POM_Favourties() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//img[@alt=\"userIcon\"]")
	private WebElement sign_up;

	@FindBy(name="word")
	private WebElement email;

	@FindBy(xpath="//button[text()='Continue']")
	private WebElement contin;

	@FindBy(xpath="(//input[@class='jsx-2146435706 form__control'])[2]")
	private WebElement password;

	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continu2;
	
	@FindBy(id="wzrk-cancel")
	private WebElement updates;

	@FindBy(xpath="(//img[@title=\"Search\"])[2]")
	private WebElement search_icon;
	

	@FindBy(xpath="(//div[@class=\"jsx-2260322414 key\"])[9]")
	private WebElement english;
	
	@FindBy(xpath="(//a[@class=\"jsx-2954069668 ic__cn\"])[3]")
	private WebElement selection;
	
	@FindBy(xpath="(//span[@class=\"jsx-1341217708 iconsFav\"])[2]")
	private WebElement favourt;
	
	@FindBy(xpath="//img[@alt=\"userIcon\"]")
	private WebElement view;
	
	@FindBy(xpath="//a[text()='My Favorites']")
	private WebElement my_fav;
	
	@FindBy(xpath="(//a[@class=\"jsx-2954069668 ic__cn\"])[1]")
	private WebElement addtoexcel;
	
	@FindBy(xpath="(//h1[text()='Dalal Street Investment Journal'])[2]")
	private WebElement list;
	
	public WebElement getList() {
		return list;
	}
	public WebElement getAddtoexcel() {
		return addtoexcel;
	}
	public WebElement getMy_fav() {
		return my_fav;
	}
	
	public WebElement getView() {
		return view;
	}
	
	public WebElement getSelection() {
		return selection;
	}

	public WebElement getFavourt() {
		return favourt;
	}

	public WebElement getSearch_icon() {
		return search_icon;
	}

	public WebElement getEnglish() {
		return english;
	}

	public WebElement getUpdates() {
		return updates;
	}
	
	public WebElement getSign_up() {
		return sign_up;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContin() {
		return contin;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getContinu2() {
		return continu2;
	}
	
}
