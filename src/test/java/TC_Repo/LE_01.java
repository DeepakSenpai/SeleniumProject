package TC_Repo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.JavaUtility;
import Generic_utility.ListenersImplementationClass;
import ObjectRepository.CreateNewLeadsPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsHomePage;

@Listeners(ListenersImplementationClass.class)
public class LE_01 extends BaseClass{
	
	@Test(retryAnalyzer = Generic_utility.RetryAnalyzerImplementationClass.class)
	public void le_01Case() throws Exception{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		String FIRSTNAME=EUTIL.getIndividualTestDate("Leads",2,1);
		String LASTNAME=EUTIL.getIndividualTestDate("Leads",2,2);
		String COMPANY=EUTIL.getIndividualTestDate("Leads",2,3);
		HomePage hp = new HomePage(driver);
		hp.clickOnOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cnlp = new CreateNewLeadsPage(driver);
		cnlp.createLeads(FIRSTNAME+num, LASTNAME, COMPANY);
		Thread.sleep(4000);	
	}

}
