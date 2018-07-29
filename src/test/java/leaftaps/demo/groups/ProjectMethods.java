package leaftaps.demo.groups;


public class ProjectMethods extends SeMethods {	

	
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

	
	public void logout() {
		closeBrowser();
	}

}
