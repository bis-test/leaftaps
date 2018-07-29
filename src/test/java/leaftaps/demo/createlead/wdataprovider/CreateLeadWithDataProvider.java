package leaftaps.demo.createlead.wdataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadWithDataProvider extends ProjectMethods{


		@Test(dataProvider="fetchData")
		public void createLead(String cName,String fName,String lName,String email, String phoneNum) throws InterruptedException 
		{	
			click(locateElement("linkText", "Create Lead"));
			type(locateElement("id", "createLeadForm_companyName"), cName);
			type(locateElement("id", "createLeadForm_firstName"), fName);
			type(locateElement("id", "createLeadForm_lastName"), lName);
			type(locateElement("id", "createLeadForm_primaryEmail"), "email");
			type(locateElement("id", "createLeadForm_primaryPhoneNumber"), phoneNum);
			click(locateElement("name", "submitButton"));		
		}
		
		@DataProvider(name="fetchData")
		public Object[][] fetchData() throws IOException {
			ReadExcel excel = new ReadExcel();		
			return excel.readExcel();
		}	
		

	}


