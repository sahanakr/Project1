package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lopinpage {
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	public void loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setun(String user)
	{
		un.sendKeys(user);
		
	}
	
	public void setp(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	public void clicklogin()
	{
		login.click();
	}
	

}
