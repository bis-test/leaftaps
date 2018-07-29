package leaftaps.demo.createlead;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateLead extends SeMethods {

	@Test
	
	public void createlead() {

		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		WebElement loginButton = locateElement("className", "decorativeSubmit");
		click(loginButton);

		WebElement crmlink = locateElement("linkText","CRM/SFA");
		click(crmlink);

		WebElement leadlink = locateElement("linkText","Leads");
		click(leadlink);

		WebElement createlead = locateElement("xpath","//a[text()='Create Lead']");
		click(createlead);

		WebElement companyname = locateElement("id","createLeadForm_companyName");
		type(companyname, "HCL");

		WebElement firstname = locateElement("id","createLeadForm_firstName");
		type(firstname, "Biswajit");

		WebElement lastname = locateElement("id","createLeadForm_lastName");
		type(lastname, "Sundara");

		WebElement source= locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(source,"Employee");

		WebElement campaign= locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingIndex(campaign, 3);
		
		WebElement leadbutton = locateElement("className","smallSubmit");
		click(leadbutton);	

		System.out.println("Lead is created successfully");

	}

}
