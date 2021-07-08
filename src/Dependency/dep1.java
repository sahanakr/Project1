package Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.asserts.*;

public class dep1 {
	@Test
	public void compose()
	{
		System.out.println("Compose");
	}
	@Test(dependsOnMethods="compose")
	public void sentitems()
	{
		System.out.println("sentitems");
		Assert.fail();
	}
	@Test(dependsOnMethods="sentitems")
	public void trash()
	{
		System.out.println("trash");
		
	}

}
