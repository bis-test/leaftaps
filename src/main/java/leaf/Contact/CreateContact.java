package leaf.Contact;

import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class CreateContact extends ProjectMethods{

	//@Test(invocationCount=2)
	@Test(priority=0)
	public void createContact() {
		//login();
		System.out.println("Create contact is invoked");
		click(locateElement("linkText", "Contacts"));
		click(locateElement("linkText", "Create Contact"));
		type(locateElement("id", "firstNameField"), "Biswajit");
		type(locateElement("id", "lastNameField"), "Sundara");
		click(locateElement("name", "submitButton"));
		System.out.println("Contact created successfully");
		//closeApp();
	}

}