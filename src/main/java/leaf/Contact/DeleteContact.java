package leaf.Contact;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DeleteContact extends ProjectMethods{
	
	//@Test(dependsOnMethods="leaf.Contact.CreateContact.EditContact")
	@Test(priority=3)
	public void deleteContact() throws InterruptedException {
		
		System.out.println("Delete Contact is invoked");
		click(locateElement("linkText", "Contacts"));
		click(locateElement("linkText", "Find Contacts"));
	
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Biswajit");
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		
		String sText = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		clickWithNoSnap(locateElement("linkText", "Deactivate Contact"));
		acceptAlert();
		
		click(locateElement("linkText", "Find Contacts"));
		type(locateElement("xpath", "//label[contains(text(),'Contact Id:')]/following::input[1]"), sText);
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");		
	}
}
