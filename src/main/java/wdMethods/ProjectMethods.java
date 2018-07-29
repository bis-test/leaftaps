package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods {	


	
	@Parameters({"url","userName","password"})
	@BeforeMethod
	public void login(String url , String userName, String password ) {
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
