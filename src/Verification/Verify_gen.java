package Verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Verify_gen {
	public void verifytitle(WebDriver driver, String title)
	{
		try
		{
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.titleContains(title));
		Reporter.log("Title is matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching",true);
			Assert.fail();
		}
	}
	public void verifyele(WebDriver driver,WebElement ele)
	{
		try
		{
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);
			Assert.fail();
		}
	}

}
