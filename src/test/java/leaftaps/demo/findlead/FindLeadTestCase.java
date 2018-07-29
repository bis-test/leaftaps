package leaftaps.demo.findlead;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class FindLeadTestCase extends SeMethods{

	@Test
	public void FindLead() {


		//This will pass the parameters chrome and the leaftap URL to SE methods
		//The code is in SE methods which will launch the browser and open the website.
		startApp("chrome","http://leaftaps.com/opentaps");

		//Provide user name & password
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");

		//Click on submit
		WebElement loginButton = locateElement("className", "decorativeSubmit");
		click(loginButton);

		//Click on crmsfa link
		WebElement crmlink = locateElement("linkText","CRM/SFA");
		click(crmlink);

		//Click on leads
		WebElement leadlink = locateElement("linkText","Leads");
		click(leadlink);

		//Click on find lead
		WebElement findlead = locateElement("xpath","//a[text()='Find Leads']");
		click(findlead);

		//Enter lead first name
		WebElement leadfname = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(leadfname,"Biswajit");

		//Click find button
		WebElement findbutton = locateElement("xpath","(//button[@class='x-btn-text'])[7]");
		click(findbutton);
		
		
		WebElement leadid = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		//System.out.println("Lead id= "+leadid.getText());
		click(leadid);
		
		//WebElement fstName = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']");
        //System.out.println("Lead First Name=" +fstName.getText());
        
		//write Edit lead program also
		
		//close the driver
		//driver.close();
	}


}
