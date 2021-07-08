package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.io.FileHandler;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Scrshot {
	public void capture(WebDriver driver, String tcname,String browser) throws IOException, InterruptedException
	{
		String path="./Screenshot/";
		Date d=new Date();
		String date=d.toString().replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(3000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(path+date+tcname+"_"+browser+".png");
		FileHandler.copy(src, dst);		
		System.out.println("Screenshot captured");
		
	}

}
