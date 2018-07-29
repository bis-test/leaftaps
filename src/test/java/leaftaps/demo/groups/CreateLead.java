package leaftaps.demo.groups;

import org.testng.annotations.Test;

public class CreateLead extends ProjectMethods{


	@Test(groups= {"smoke"})
	public void createLead() {	
		
		login();
		String cname="Mindtree";
		String fname="Shikun";
		String lname="Mohapatra";
		String email="shikunmohapatra@gmail.com";
		String pno = "878890123";
		
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ""+pno);
		click(locateElement("name", "submitButton"));
		logout();

	}	

}	










