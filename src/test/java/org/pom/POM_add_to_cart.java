package org.pom;

import org.Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_add_to_cart extends BaseClass{
	
	public POM_add_to_cart() {
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
	
	@FindBy(xpath="(//p[@class=\"jsx-2954069668 ic__cn__title\"])[2]")
	private WebElement choose;
	
	@FindBy(xpath="(//p[@class=\"jsx-99885724 mzmagazine__pricedetails__lists__plan__duration\"])[3]")
	private WebElement buy;
	
	@FindBy(xpath="(//img[@title=\"Search\"])[2]")
	private WebElement search_icon;
	
	@FindBy(xpath="(//div[@class=\"jsx-2260322414 key\"])[11]")
	private WebElement tamil;
	
	@FindBy(xpath="//p[text()='Penmani']")
	private WebElement penmani;
	
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement add;
	
	
	@FindBy(xpath="//span[@class=\"jsx-2531214243\"]")
	private WebElement toview;
	
	@FindBy(xpath="//div[@class=\"jsx-2471316163\"]")
	private WebElement addtocart1;
	
	@FindBy(xpath="//p[text()='No, thanks']")
	private WebElement close;
	
	@FindBy(xpath="//p[text()='Penmani']")
	private WebElement addtoexcel;
	
	public WebElement getAddtoexcel() {
		return addtoexcel;
	}
	
	public WebElement getClose() {
		return close;
	}
	
	public WebElement getAddtocart1() {
		return addtocart1;
	}
	
	public WebElement getToview() {
		return toview;
	}
	
	
	public WebElement getAdd() {
		return add;
	}
	
	
	public WebElement getPenmani() {
		return penmani;
	}
	
	public WebElement getTamil() {
		return tamil;
	}
	
	public WebElement getSearch_icon() {
		return search_icon;
	}

	public WebElement getBuy() {
		return buy;
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