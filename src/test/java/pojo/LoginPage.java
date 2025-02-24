package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// @FindBys({ @FindBy(id = "eml"), @FindBy(xpath = "//input[@placeholder='Email
	// address or phone number']") })
	@FindAll({ @FindBy(id = "eml"), @FindBy(xpath = "//input[@placeholder='Email address or phone number']") })
	private WebElement txtUser;

	@FindBy(id = "pass")
	private WebElement txtPass; 

	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
