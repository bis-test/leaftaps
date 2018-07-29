package leaf.Contact;

import org.testng.annotations.Test;

//import org.junit.Test;

import wdMethods.ProjectMethods;

public class EditContact extends ProjectMethods{
	
	@Test(dependsOnMethods="leaf.Contact.CreateContact.createContact", priority=1)
	
	public void editContact() throws InterruptedException {
		
		System.out.println("Edit contact is invoked");
		click(locateElement("linkText", "Contacts"));
		click(locateElement("linkText", "Find Contacts"));
		
		type(locateElement("xpath", "(//input[@name='lastName'])[3]"), "Biswajit");
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		
		//String sText = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		
		type(locateElement("id", "updateContactForm_departmentName"), "IT");
		
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		
		
		
	}

}
