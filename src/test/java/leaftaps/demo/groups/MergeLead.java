package leaftaps.demo.groups;

import org.testng.annotations.Test;

public class MergeLead {
	
	@Test(groups= {"smoke"})
	public void mergelead()
	{
		System.out.println("Merge Lead is executed");
	}

}
