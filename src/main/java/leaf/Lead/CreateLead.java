package leaf.Lead;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ReadLeadExcel;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{


	@Test (groups= {"smoke" }, dataProvider="fetchLeadData")
	public void createLead(String cname, String fname, String lname, String email, String pno) {	
		
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ""+pno);
		click(locateElement("name", "submitButton"));


	}	

	@DataProvider(name="fetchLeadData")
	public Object[][] fetchdata() throws IOException
	{
		ReadLeadExcel excel = new ReadLeadExcel();
		return excel.readExcel();
	}


}
