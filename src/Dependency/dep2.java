package Dependency;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dep2 {
	@Parameters({"country","city"})
	@Test
	public void compose(String country,String city)
	{
		System.out.println(country);
		System.out.println(city);
	}

}
