package NG_Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import Generic.*;
import Generic.*;
import Generic.*;
import Generic.*;
public class Generic_script {
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		
		
	}
	
	
	@Parameters("browser")
	@BeforeMethod
	public void oapp(String browser)
	{
		if(browser.equals("firefox"))
		{
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("http://localhost/login.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	}
	@Parameters("browser")
	@AfterMethod
	public void capp(ITestResult res,String browser) throws IOException, InterruptedException
	{
		Scrshot s=new Scrshot();
		
		int status = res.getStatus();
		System.out.println(status);
		String tcname = res.getName();
		System.out.println(tcname);
		if(status==2)
		{
			s.capture(driver, tcname,browser);
			Thread.sleep(3000);
		}
		driver.quit();
	}

}
