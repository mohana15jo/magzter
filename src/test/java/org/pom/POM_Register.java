package org.pom;

import org.Utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Register extends BaseClass{

	public POM_Register() {
		PageFactory.initElements(driver, this);
}

@FindBy(xpath="//img[@alt=\"userIcon\"]")
private WebElement sign_up;

@FindBy(xpath="//input[@name='word']")
private WebElement email;

@FindBy(xpath="//button[text()='Continue']")
private WebElement contin;

public WebElement getSign_up() {
	return sign_up;
}

public WebElement getEmail() {
	return email;
}

public WebElement getContin() {
	return contin;
}

@FindBy(id="fullname")
private WebElement fullname;

@FindBy(id="last-name")
private WebElement lastname;

@FindBy(id="password")
private WebElement password;

@FindBy(id="buttonId")
private WebElement create_account;

@FindBy(xpath="//img[@alt=\"userIcon\"]")
private WebElement view;

@FindBy(xpath="//a[text()='My Profile']")
private WebElement my_profile;

public WebElement getMy_profile() {
	return my_profile;
}

public WebElement getView() {
	return view;
}
public WebElement getFullname() {
	return fullname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getPassword() {
	return password;
}

public WebElement getCreate_account() {
	return create_account;
}



}
