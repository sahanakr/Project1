package Dependency;

import org.testng.annotations.Test;

public class regression {
	@Test
	public void compose()
	{
		System.out.println("Compose");
	}
	@Test(groups="regression")
	public void sentitems()
	{
		System.out.println("sentitems");
	}
	@Test(groups="smoke")
	public void sent()
	{
		System.out.println("sent");
	}

}
