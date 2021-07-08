package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Act {
	public void RightClick(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		//act.contextClick().perform();
	}
	public void dragd(WebDriver driver, WebElement ele,WebElement ele1)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(ele, ele1).perform();
	}
	public void doublec(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele);
	}
	public void mouseh(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele);
	}

}
