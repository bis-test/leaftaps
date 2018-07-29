package leaftaps.demo.createlead.wdataprovider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectMethods extends SeMethods {	

	
	@BeforeMethod
	public void login() {
		
		String url= "http://leaftaps.com/opentaps";
		String userName="DemoSalesManager";
		String password="crmsfa";
		
		startApp("chrome", url);
		type(locateElement("id", "username"), userName);
		type(locateElement("id", "password"), password);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}

	
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}

	
}
