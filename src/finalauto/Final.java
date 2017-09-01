package finalauto;




import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import org.apache.log4j.Logger;

public class Final {
	//File file = new File("E:\\workspace\\TechFetch.Automation\\Locator.properties"); 
	WebDriver driver;
	Logger log = Logger.getLogger("devpinoyLogger"); 
	public  Final(WebDriver driver)
    {    
    	this.driver=driver;
}
    public void login() throws IOException, InterruptedException
    {
    
    	File file = new File("D:\\Workspace\\finalauto\\Locatorr.properties"); 
    	FileInputStream fileInput;
    	fileInput = new FileInputStream(file);
    	Properties prop = new Properties();
    	prop.load(fileInput);
    	Thread.sleep(1000);
    	driver.get(prop.getProperty("URL"));
   	 log.info("Opening Techfetch webiste");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath(".//*[@id='ucHeaderCtrl_divCandidate']/a")).click();
   	 log.info("Opening candidate menu");
    	Thread.sleep(1000);
     	driver.findElement(By.xpath(".//*[@id='jsloginpop']")).click();
     	 log.info("Clicking Login button");
     	driver.switchTo().defaultContent();
	    driver.switchTo().frame("candidatecontentframe");
		driver.findElement(By.xpath("//.//*[@id='txtemailid']")).sendKeys(prop.getProperty("Username"));
	  	 log.info("Entering mailid");
		driver.findElement(By.xpath("//.//*[@id='txtpwd']")).sendKeys(prop.getProperty("password"));
		 log.info("Entering password");
	driver.findElement(By.xpath("//.//*[@id='btnSubmit']")).click();
	log.info("Clicking submit button");
 	Thread.sleep(1000);

  
    }
    public void upload() throws Exception
 {         File file = new File("D:\\Sys1\\workspace\\July28\\Locator.properties"); 
 FileInputStream fileInput;
 fileInput = new FileInputStream(file);
 Properties prop = new Properties();
 prop.load(fileInput);

    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("contentframe");
    	driver.findElement(By.xpath(".//*[@id='ucMoreResumes_lblJobs']/table/tbody/tr[1]/td[4]/a/img")).click();
   	 log.info("Clicking Replacedocs");
    	Thread.sleep(1000);
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("replacedoccontentframe");
    	Thread.sleep(1000);
    	 driver.findElement(By.id("resumeupload")).clear();
     
    	
	       driver.findElement(By.id("resumeupload")).sendKeys(prop.getProperty("path"));
	       
	    	 log.info("Uploading Resume");
    	Thread.sleep(10000);
    	//WebElement Element = driver.findElement(By.xpath(".//*[@id='dupupload2']/div/div/div"));
    	// Element.sendKeys("C:\\hai.doc");
    	driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
     	 log.info("Clicking Submit button");
    	Thread.sleep(3000);
driver.findElement(By.id("btnClose")).click();
	 log.info("Clicking Close button");
    }
    public void profile() throws Exception
    {        File file = new File("D:\\Sys1\\workspace\\July28\\Locator.properties"); 
    FileInputStream fileInput;
    fileInput = new FileInputStream(file);
    Properties prop = new Properties();
    prop.load(fileInput);

    	Set<String> Wi = driver.getWindowHandles();
    	System.out.println("No of Windows:"+Wi.size());
    	Iterator it=Wi.iterator();
    	//String main=(String) it.next();
    	System.out.println(it.next());
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(2000);
    		driver.switchTo().defaultContent();
        	driver.switchTo().frame("contentframe");
    	driver.findElement(By.xpath(".//*[@id='ucMoreResumes_lblJobs']/table/tbody/tr[4]/td[5]/a/img")).click();
     	 log.info("Clicking Profile");
           Wi = driver.getWindowHandles();
    	log.info("No of Windows:"+Wi.size());
    	it=Wi.iterator();
    	it=Wi.iterator();
    	String mmm=(String) it.next();
    	String nnn=(String) it.next();
    	System.out.println(mmm);
    	System.out.println(nnn);
    	driver.switchTo().window(nnn);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(10000);
    	driver.findElement(By.cssSelector("#download")).click();
    	log.info("Downloading Profile");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(".//*[@id='forward']")).click(); 
    	log.info("Clicking Forward Button");
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame("jsforwardprofilecontentframe");
		  driver.findElement(By.xpath(".//*[@id='txtTo']")).sendKeys(prop.getProperty("mailid")); 
		  log.info("Entering Forward Mailid");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(".//*[@id='btnsendmail']")).click(); 
		  log.info("Clicking SendButton");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(".//*[@id='btnPnlClose']")).click();
		  log.info("Clicking CloseButton");
     driver.close();
  	driver.switchTo().window(mmm);
    	
    }
    public void myresume() throws Exception
    {
    	//driver.switchTo().defaultContent();
    	//driver.switchTo().frame("contentframe");
        File file = new File("D:\\Sys1\\workspace\\July28\\Locator.properties"); 
        FileInputStream fileInput;
        fileInput = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fileInput);

    	driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[2]/a")).click();
    	log.info("Opening MyResume");
    	driver.findElement(By.xpath(".//*[@id='addresumetab']")).click();
    	log.info("Selecting AddResume");
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("contentframe");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath(".//*[@id='txtFName']")).sendKeys(prop.getProperty("firstname")); 
    	log.info("Entering FirstName");
    	driver.findElement(By.xpath(".//*[@id='txtMName']")).sendKeys(prop.getProperty("middlename")); 
     	log.info("Entering MiddleName");
    
    	driver.findElement(By.xpath(".//*[@id='txtLName']")).sendKeys(prop.getProperty("lastname")); 
     	log.info("Entering LastName");
    	Thread.sleep(2000);
    	Select oSelect = new Select(driver.findElement(By.xpath(".//*[@id='ddsCountry']")));
    	log.info("Selecting Country");
    	oSelect.selectByIndex(12);
    	driver.findElement(By.xpath(".//*[@id='txtCity']")).sendKeys(prop.getProperty("city"));
    	log.info("Entering City,state or zip");
    	driver.findElement(By.xpath(".//*[@id='txtPhoneM']")).sendKeys(prop.getProperty("phone(mobile)"));
    	log.info("Entering MobilePhone");
    	driver.findElement(By.xpath(".//*[@id='txtPhoneA']")).sendKeys(prop.getProperty("phone(home)"));
    	log.info("Entering HomePhone");
    	driver.findElement(By.xpath(".//*[@id='txtPhoneW']")).sendKeys(prop.getProperty("phone(work)"));
    	log.info("Entering WorkPhone");
    	driver.findElement(By.xpath(".//*[@id='txtExtn']")).sendKeys(prop.getProperty("phoneextension"));
    	log.info("Entering Extension");

    	Select oSelect1 = new Select(driver.findElement(By.xpath(".//*[@id='ddlPreferredTime']")));
    	
    	oSelect1.selectByIndex(2);
    	log.info("Selecting PrefferedTime");
    	Select oSelect2 = new Select(driver.findElement(By.xpath(".//*[@id='ddlPhone']")));
    	
    	oSelect2.selectByIndex(2);
    	log.info("Selecting Home");
    	Select oSelect3 = new Select(driver.findElement(By.xpath(".//*[@id='ddsCitizen']")));
    	oSelect3.selectByIndex(2);
    	log.info("Selecting Citizen");
    	driver.findElement(By.xpath(".//*[@id='chkWorkAuthorizationTNEAD']")).click();
    	log.info("Clicking WorkAuthorization");
    	Select oSelect4 = new Select(driver.findElement(By.xpath(".//*[@id='ddltneadlist']")));
    	oSelect4.selectByIndex(2);
    	log.info("Selecting NeedNewH1B");
    	driver.findElement(By.id("resumeupload")).clear();
    	log.info("clearing upload");
        driver.findElement(By.id("resumeupload")).sendKeys(prop.getProperty("upload"));
        log.info("Selecting Resume");
    	Thread.sleep(10000);
    	driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
    	log.info("Clicking Submit button");
    	Thread.sleep(100);
    	driver.switchTo().defaultContent();
	    driver.switchTo().frame("contentframe");
	    log.info("Switching to Professional");
	    Thread.sleep(1000);
	    driver.findElement(By.id("rdBachelor")).click();
	    log.info("Selecting Bachelor button on Highest degree");
	    new Select(driver.findElement(By.id("ddlExpectedSalaryYear"))).selectByVisibleText("$10K");
	    log.info("Selecting Expected salary per year");
	    
	    new Select(driver.findElement(By.id("ddlExpectedSalaryHour"))).selectByVisibleText("$15");
	    log.info("Selecting Expected salary per hour");
	    driver.findElement(By.id("txtJobTitle")).clear();
	  
	    driver.findElement(By.id("txtJobTitle")).sendKeys(prop.getProperty("jobtitle"));
	    log.info("Entering job title");
	    new Select(driver.findElement(By.id("ddsTotalExperience"))).selectByVisibleText("17");
	    log.info("Selecting total experience");
	    driver.findElement(By.cssSelector("option[value=\"17\"]")).click();
	    log.info("Clicking Value ");
	    new Select(driver.findElement(By.id("ddsUSAExperience"))).selectByVisibleText("15");
	    log.info("Selecting USA experience");
	    driver.findElement(By.id("txtResumeTitle")).clear();
	   
	    driver.findElement(By.id("txtResumeTitle")).sendKeys(prop.getProperty("resumetitle"));
	    log.info("Entering resume title");
	    driver.findElement(By.id("resumeupload")).clear();
	    driver.findElement(By.id("resumeupload")).sendKeys(prop.getProperty("uploadfile"));
	    log.info("Uploading resume");
	    Thread.sleep(10000);
	    driver.findElement(By.id("btnProfessional")).click();
	    log.info("Clicking save and next button");
	    Thread.sleep(1000);
	
	  //  driver.switchTo().defaultContent();
	  //  driver.switchTo().frame("contentframe");
	   
	    //driver.findElement(By.linkText("*Skills(Incomplete)")).click();
	    
	    new Select(driver.findElement(By.id("ddlSpecializedArea"))).selectByVisibleText("Java, J2EE"); 
	    log.info("Selecting specialized area");
	    new Select(driver.findElement(By.id("ddlSpecializedSkill"))).selectByVisibleText("Java Front End");
	    log.info("Selecting specialized skills");
	    driver.findElement(By.id("txtSkill1")).clear();
	    driver.findElement(By.id("txtSkill1")).sendKeys(prop.getProperty("skill"));
	    log.info("Entering skill1");
	    new Select(driver.findElement(By.id("ddlYears1"))).selectByVisibleText("2");
	    log.info("Selecting years for skill1 ");
	    driver.findElement(By.id("btnSkills")).click();
	    log.info("Clicking save and next button");
	    Thread.sleep(10000);
	   // driver.findElement(By.id("Skillsli")).click();
	 
	  //  driver.findElement(By.cssSelector("#Preferencesli > a")).click();
	    driver.findElement(By.id("chkBusinessDomaintelecom")).click();
	    log.info("Clicking preferred employment ");
	    driver.findElement(By.id("radPublishToAll")).click();
	    log.info("Selecting resume publishing options ");
	    driver.findElement(By.id("chkprefjobyes")).click();
	    log.info("Selecting domain experience");
	    driver.findElement(By.id("btnPreferences")).click();
	      log.info("Clicking save and next button");
	    Thread.sleep(10000);
	    driver.findElement(By.id("txtKeywords")).clear();
	    driver.findElement(By.id("txtKeywords")).sendKeys(prop.getProperty("keywords"));
	    log.info("Entering keywords ");
	    driver.findElement(By.id("chkcontarctjobtype")).click();
	    log.info("Clicking job type ");
	    driver.findElement(By.id("contracttype")).click();
	    driver.findElement(By.id("chkpermanentjobtype")).click();
	    driver.findElement(By.id("txtJobwithtitle")).clear();
	    driver.findElement(By.id("txtJobwithtitle")).sendKeys(prop.getProperty("title"));
	    log.info("Entering job with title ");
	    new Select(driver.findElement(By.id("ddlYears"))).selectByVisibleText("2");
	    log.info("Selecting years");
	    driver.findElement(By.cssSelector("#ddlYears > option[value=\"2\"]")).click();
	   // new Select(driver.findElement(By.id("lbPriorityList"))).selectByVisibleText("Florida (FL)");
	   // driver.findElement(By.xpath("//div[@onclick='javascript: OptSelect();']")).click();
	    //driver.findElement(By.xpath("//div[@onclick='javascript: OptUnSelect();']")).click();
	    driver.findElement(By.id("txtAlertName")).clear();
	    driver.findElement(By.id("txtAlertName")).sendKeys(prop.getProperty("alert"));
	    log.info("Entering alert name ");
	    driver.findElement(By.id("btnJobAlert")).click();
	    log.info("Clicking save and next button");
	    
	  }
    public void myjob() throws Exception
    {
        File file = new File("D:\\Sys1\\workspace\\July28\\Locator.properties"); 
        FileInputStream fileInput;
        fileInput = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fileInput);

        driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[3]/a")).click();
        log.info("clicking the my jobs tab");
         driver.findElement(By.id("fetchjobstab")).click();
        log.info("clicking fetch job tab");
         Thread.sleep(1000);
         driver.switchTo().defaultContent();
           driver.switchTo().frame("contentframe");
           log.info("move to content frame");
            driver.findElement(By.id("txtKeyword")).clear();
             driver.findElement(By.id("txtKeyword")).sendKeys(prop.getProperty("keywords"));
             log.info("Entering the keyword");
            driver.findElement(By.id("rbKeywordsAll")).click();
            log.info("select the type");
            new Select(driver.findElement(By.id("ddlCountry"))).selectByVisibleText("India");
            log.info("select the country");
            
            new Select(driver.findElement(By.id("ddlSpecializedArea"))).selectByVisibleText("Java, J2EE");
            log.info("select the specialized skills");
            driver.findElement(By.id("li1")).click();
            log.info("click the browse button");
             Thread.sleep(1000);
            driver.findElement(By.id("txtcity")).clear();
           
            driver.findElement(By.id("txtcity")).sendKeys(prop.getProperty("cityname"));
            log.info("select the state");
           // Alert A3 = driver.switchTo().alert();
            //A3.accept();
           // driver.findElement(By.cssSelector("i.fa.fa-forward")).click();
            //driver.findElement(By.cssSelector("div.btn.btn-upload")).click();
            //driver.findElement(By.cssSelector("div.btn.btn-upload")).click();
           // driver.findElement(By.id("chkRemote")).click();
           // driver.findElement(By.cssSelector("i.fa.fa-forward")).click();
           // driver.findElement(By.cssSelector("div.btn.btn-upload")).click();
          //  driver.findElement(By.cssSelector("i.fa.fa-backward")).click();
            driver.findElement(By.id("chkPreferredEmployment_5")).click();
            log.info("Clicking prefered employment");
            driver.findElement(By.id("chkWorkAuthorization_1")).click();
            log.info("Clicking the work authorization");
            driver.findElement(By.id("chkWorkAuthorization_5")).click();
            log.info("Clicking the work authorization");
            driver.findElement(By.id("chkWorkAuthorization_5")).click();
            log.info("Clicking the work authorization");
            driver.findElement(By.id("chkWorkAuthorization_4")).click();
            log.info("Clickingthe work authorization");
            driver.findElement(By.id("chkWorkAuthorization_3")).click();
            log.info("Clicking the work authorization");
            driver.findElement(By.id("chkWorkAuthorization_2")).click();
            log.info("Clickingthe work authorization");
            driver.findElement(By.id("chkWorkAuthorization_1")).click();
            log.info("Clicking the work authorization");
            driver.findElement(By.id("chkRemote")).click();
            log.info("Clickingthe check remote option");
            driver.findElement(By.id("txtExcludeWords")).clear();
            driver.findElement(By.id("txtExcludeWords")).sendKeys(prop.getProperty("excludekeyword"));
            log.info("Clicking the exclude words");
            new Select(driver.findElement(By.id("ddlJobPost"))).selectByVisibleText("2 Days");
            log.info("Selecting a job within a days/months/years");
            driver.findElement(By.id("btnFetchJobs")).click();
            log.info("Clicking a fetch job button");
    }
    
    public void jobalert() throws Exception
    {
    	File file = new File("D:\\Sys1\\workspace\\July28\\Locator.properties"); 
        FileInputStream fileInput;
        fileInput = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fileInput);
        driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[4]/a[1]")).click();
        log.info("Clicking JobAlert menu ");
        //create job alert
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='createjobalerttab']")).click();
        log.info("Clicking Create jobalert ");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("contentframe");
        Select oSelect = new Select(driver.findElement(By.xpath(".//*[@id='ddlProfile']")));
        log.info("Selecting profile ");
        oSelect.selectByIndex(5);
        driver.findElement(By.xpath(".//*[@id='txtExclucompname']")).sendKeys(prop.getProperty("excludecompanyname"));
        log.info("Entering exclude company name");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='btnSaveAlert']")).click();
        log.info("Clicking save alert");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        //alert list
        driver.findElement(By.xpath(".//*[@id='alertlist']")).click();
        log.info("Clicking alertlist");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("contentframe");
        Select oselect = new Select(driver.findElement(By.xpath(".//*[@id='consstatus-filter']")));
   
        oselect.selectByIndex(0);
        log.info("Selecting Consolidate alert ");
        Select oselect1 = new Select(driver.findElement(By.xpath(".//*[@id='insstatus-filter']")));
        oselect1.selectByIndex(0);
        log.info("Selecting instant alert ");
        Thread.sleep(1000);
        //delete alert
        driver.findElement(By.xpath(".//*[@id='tblouterdiv']/table/tbody/tr[2]/td[7]/a/img")).click();
        log.info("Clicking delete button");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        // back to alert for matched jobs
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath(".//*[@id='alertlist']")).click();
        log.info("Clicking alertlist");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("contentframe");
        Select oselect2 = new Select(driver.findElement(By.xpath(".//*[@id='consstatus-filter']")));
        oselect2.selectByIndex(0);
        log.info("Selecting Consolidate alert ");
        Select oselect3 = new Select(driver.findElement(By.xpath(".//*[@id='insstatus-filter']")));
        oselect3.selectByIndex(0);
        log.info("Selecting instant alert ");
        //matched jobs
        driver.findElement(By.xpath(".//*[@id='tblouterdiv']/table/tbody/tr[2]/td[6]/a")).click();
        log.info("Clicking matched jobs ");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("contentframe");
        Thread.sleep(2000);
        /*driver.findElement(By.xpath(".//*[@id='ctl06_lnkLogin']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("applyemailframe");
        // driver.findElement(By.xpath(".//*[@id='txtCC']")).sendKeys("trainee6@tiliconveli.com");
        // driver.findElement(By.xpath(".//*[@id='fileCL']"));
        driver.findElement(By.xpath(".//*[@id='fileCL']")).click();
*/
    }
    public void features() throws Exception
    {
		driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[6]/a")).click();
		  log.info("Clicking Features button");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='demandindextab']")).click();
		  log.info("Clicking Demand index button");
		
Thread.sleep(2000);
driver.switchTo().frame("contentframe");

driver.findElement(By.xpath(".//*[@id='ddlprofile']")).click();
log.info("Clicking Profilebutton");

Select select = new Select(driver.findElement(By.id("ddlprofile")));
log.info("Selecting Profile");
List<WebElement> l = select.getOptions();

for (int i=0;i<l.size();i++)
{
select.selectByIndex(i);

driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
log.info("Clicking Submit button");
Thread.sleep(5000);
}
    }
    public void logout () throws Exception
    {
        driver.switchTo().defaultContent();
    
        Thread.sleep(10000);

        //Logout...
        driver.findElement(By.xpath(".//*[@id='drop7']/img")).click();
        log.info("Clicking user settings ");
        Thread.sleep(10000);
        driver.findElement(By.xpath(".//*[@id='mini-nav']/li/ul/li[4]/div/input")).click();
        log.info("Clicking logout button ");
        Thread.sleep(10000);
    }
    }
	  

    	
    
    

