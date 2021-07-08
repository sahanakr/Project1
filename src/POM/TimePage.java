package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimePage {
	@FindBy(xpath="//td[@class='x-btn-center']")
	private WebElement cla;
	
	@FindBy(xpath="//span[.='New']")
	private WebElement newtask;
	
	@FindBy(xpath="//div[@class='close-button']")
	private WebElement close;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement lout;
	
	public void TimePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void calndar()
	{
		cla.click();
		cla.click();
	}
	
	public void task()
	{
		newtask.click();
	}
	
	public void closebtn()
	{
		close.click();
	}
	
	public void logout()
	{
		lout.click();
	}

}
