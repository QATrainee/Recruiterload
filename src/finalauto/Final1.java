package finalauto;



import java.util.concurrent.TimeUnit;





import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.log4j.Logger;


import org.openqa.selenium.ie.InternetExplorerDriver;

import finalauto.Final;

public class Final1 {
	public static void main(String[] args) throws Exception  {
		BasicConfigurator.configure();
	
	
    	System.setProperty("webdriver.ie.driver","C:\\Program Files\\Java\\jarfiles\\IEDriverServer.exe");
    WebDriver driver = new InternetExplorerDriver(); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	//Logger log = Logger.getLogger("devpinoyLogger");
	
	
	
	Final g=new Final(driver);
	
	g.login();
	//g.upload();
	//g.profile();
	//g.myresume();
	//g.myjob();
	//g.features();
	//g.jobalert();
      g.logout();
	
	}}

