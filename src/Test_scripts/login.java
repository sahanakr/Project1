package Test_scripts;
import Verification.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import POM.*;
import NG_Generic.*;

public class login extends  Generic_script{
	@Test
	public void loginpa() throws InterruptedException
	
	{
		lopinpage lp=new lopinpage();
		lp.loginpage(driver);
		lp.setun("admin");
		lp.setp("manager");
		lp.clicklogin();
		
		WebDriverWait w=new WebDriverWait(driver, 10);
		Verify_gen v=new Verify_gen();
		//v.verifytitle(driver, "Time");
		WebElement ele=driver.findElement(By.xpath("//div[.='TIME-TRACK']"));
		v.verifyele(driver, ele);
		
		/*String title=driver.getTitle();
		System.out.println(title);
		w.until(ExpectedConditions.titleContains("Time-Track"));*/
		
		Thread.sleep(3000);
		TimePage tp=new TimePage();
		tp.TimePage(driver);
		Thread.sleep(3000);
		tp.calndar();
		Thread.sleep(3000);
		//tp.task();
		Thread.sleep(3000);
		tp.closebtn();
		Thread.sleep(3000);
		tp.logout();
		
		
	}

}
