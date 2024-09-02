package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Case3 {
	
	@Test
	public void CreateUser()
	{
		System.out.println("user created");
	}
	
	@Test(enabled = false)
//	@Test(invocationCount = 0)
	public void ModifyUser()
	{
		System.out.println("user modified");
	}
	
	@Test
	@Ignore
	public void DeleteUser()
	{
		System.out.println("user deleted");
	}


}
