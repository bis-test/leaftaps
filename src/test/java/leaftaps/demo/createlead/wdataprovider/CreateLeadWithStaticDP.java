package leaftaps.demo.createlead.wdataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class CreateLeadWithStaticDP extends ProjectMethods{


	@Test (dataProvider="fetchData")
	public void createLead(String cname, String fname, String lname, String email, int pno) {	
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ""+pno);
		click(locateElement("name", "submitButton"));

	}



   @DataProvider(name="fetchData")
	public Object[][] fetchdata()
	{
		Object[][] data = new Object[1][5];
		data[0][0] = "Google";
		data[0][1]="Priyanka";
		data[0][2]="Das";
		data[0][3]="priyankadas@google.com";
		data[0][4]=	78909878;

		return data;

	}
	
}
	






