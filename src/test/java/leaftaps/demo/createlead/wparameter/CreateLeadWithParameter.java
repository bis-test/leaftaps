package leaftaps.demo.createlead.wparameter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadWithParameter extends ProjectMethodsWithParameters{


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
		data[0][0] = "TestLeaf";
		data[0][1]="Biswajit";
		data[0][2]="Sundara";
		data[0][3]="biswajitsundara@testleaf.com";
		data[0][4]=	78909878;

		return data;

	}

}
	











