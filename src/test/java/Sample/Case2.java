package Sample;

import org.testng.annotations.Test;

public class Case2 {
	
	@Test(priority = 1 , invocationCount = 5)
	public void CreateUser()
	{
		System.out.println("user created");
	}
	
	@Test(priority = 2 , dependsOnMethods = ("CreateUser"))
	public void ModifyUser()
	{
		System.out.println("user modified");
	}
	
	@Test(priority = 3)
	public void DeleteUser()
	{
		System.out.println("user deleted");
	}


}
