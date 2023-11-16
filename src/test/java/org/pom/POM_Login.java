package org.pom;

import org.Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Login extends BaseClass{
	
	public POM_Login() {
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
