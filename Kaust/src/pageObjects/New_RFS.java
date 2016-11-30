package pageObjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;


public class New_RFS extends BaseClass{
	static FileInputStream file;
	static Properties prop;
	static WebDriverWait wait = new WebDriverWait(driver, 500);
	
       private static WebElement element = null;
       
    
    public New_RFS(WebDriver driver){
        	super(driver);
        	
	

    }     
    
    public static WebElement clik_RFS() throws Exception{
    	try{
    		prop=new Properties();
    		file=new FileInputStream("D://Incture//Selenium//FD_Test//Kaust//src//OR//xpath.properties");
    		prop.load(file);
    		System.out.println("driver value from Utils txtbox - " + driver );
    		System.out.println("wait value  from Utils txtbox - " + driver );
    		System.out.println("load prop files " );
    		
    		
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("New_RFS")))); 
			boolean status = true;
			if(element.isDisplayed() && element.isEnabled() == status)
            {
            System.out.println(element.isDisplayed());
            Log.info("RFS displayed is true ");
            Log.info("RFS Enabled  is true ");
            }else
            {
            	Log.info("Username displayed is false");
            }
            Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		
       		throw(e);
       		}
       	return element;
        }
    
    
    public static WebElement selec_drop_list() throws Exception{
    	try{
    		//Thread.sleep(2000);
    		element = driver.findElement(By.xpath(prop.getProperty("drp_selec")));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             System.out.println(element.isEnabled());
             Log.info("RFS select dropdown displayed is true ");
             Log.info("RFS select dropdown Enabled  is true ");
         	Log.info("drop down displayed and enebled ");
             }else
             {
             	Log.info("drop down failed in display and enabled  ");
             
             }
 			Log.info("drop down returns element ");
            
     	}catch (Exception e){
        		Log.error("drop down fail in catch ");
        		
        		throw(e);
        		}
        	return element;
    	     
    	     
    }
    
    
    
    
   
    
    public static WebElement drp_nano_fab() throws Exception{
    	try{
    		//Thread.sleep(2000);
    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("drp_nano_fab"))));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             Log.info("nano fabric  is true ");
             Log.info("nano fabric is true ");
             }else
             {
             	Log.info("nano fabric  failed ");
             }
             Log.info("drop element returns nano select ");
     	}catch (Exception e){
        		Log.error(" nano fabric fail");
        		
        		throw(e);
        		}
        	return element;
    	     
    	     
    }
    
    public static WebElement drp_ana_cor_lab() throws Exception{
    	try{
    		//Thread.sleep(2000);
    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("drp_ana_cor_lab"))));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             Log.info("nano fabric  is true ");
             Log.info("nano fabric is true ");
             }else
             {
             	Log.info("nano fabric  failed ");
             }
             Log.info("drop element returns nano select ");
     	}catch (Exception e){
        		Log.error(" nano fabric fail");
        		
        		throw(e);
        		}
        	return element;
    	     
    	     
    }
    
    
    
    public static WebElement btn_req_for_servi() throws Exception{
    	try{
    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("btn_req_for_servi"))));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             Log.info("next btn is true ");
             Log.info("next btn is true ");
             }else
             {
             	Log.info("next btn has  failed ");
             }
             Log.info("next btn has passed element");
     	}catch (Exception e){
        		Log.error(" next btn has fail in catch ");
        		
        		throw(e);
        		}
        	return element;
    	     
    	     
    }
    
    
   
    public static WebElement sample_Section() throws Exception{
    	try{
    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sample_Section"))));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             Log.info("sample_Section is true ");
             Log.info("sample_Section is true ");
             }else
             {
             	Log.info("sample_Section has  failed ");
             }
             Log.info("sample_Section has passed element");
     	}catch (Exception e){
        		Log.error(" sample_Section has fail in catch ");
        		
        		throw(e);
        		}
        	return element;
           
    }
    
    
    public static WebElement calender_RFS_Sev_Ses_Ico() throws Exception{
    	try{
    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("calender_RFS_Sev_Ses_Ico"))));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             Log.info("sample_Section is true ");
             Log.info("sample_Section is true ");
             }else
             {
             	Log.info("calender_RFS_Sev_Ses has  failed ");
             }
             Log.info("calender_RFS_Sev_Ses has passed element");
     	}catch (Exception e){
        		Log.error(" calender_RFS_Sev_Ses has fail in catch ");
        		
        		throw(e);
        		}
        	return element;
           
    }
    
    public static WebElement calender_RFS_Sev_Ses_month() throws Exception{
    	try{
    		
    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("calender_RFS_Sev_Ses_Month"))));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             Log.info("sample_Section is true ");
             Log.info("sample_Section is true ");
             }else
             {
             	Log.info("calender_RFS_Sev_Ses has  failed ");
             }
             Log.info("calender_RFS_Sev_Ses has passed element");
     	}catch (Exception e){
        		Log.error(" calender_RFS_Sev_Ses has fail in catch ");
        		
        		throw(e);
        		}
        	return element;
           
    }
    
    public static WebElement calender_RFS_Sev_Ses_jan() throws Exception{
    	try{
    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("calender_RFS_Sev_Ses_jan"))));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             Log.info("sample_Section is true ");
             Log.info("sample_Section is true ");
             }else
             {
             	Log.info("calender_RFS_Sev_Ses has  failed ");
             }
             Log.info("calender_RFS_Sev_Ses has passed element");
     	}catch (Exception e){
        		Log.error(" calender_RFS_Sev_Ses has fail in catch ");
        		
        		throw(e);
        		}
        	return element;
           
    }
    
    public static WebElement calender_RFS_Sev_Ses_feb() throws Exception{
    	try{
    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("calender_RFS_Sev_Ses_feb"))));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             Log.info("sample_Section is true ");
             Log.info("sample_Section is true ");
             }else
             {
             	Log.info("calender_RFS_Sev_Ses has  failed ");
             }
             Log.info("calender_RFS_Sev_Ses has passed element");
     	}catch (Exception e){
        		Log.error(" calender_RFS_Sev_Ses has fail in catch ");
        		
        		throw(e);
        		}
        	return element;
           
    }
    public static WebElement calender_RFS_Sev_Ses_mar() throws Exception{
    	try{
    		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("calender_RFS_Sev_Ses_mar"))));	
     		
    	     boolean status = true;
 			if(element.isDisplayed() && element.isEnabled() == status)
             {
             System.out.println(element.isDisplayed());
             Log.info("sample_Section is true ");
             Log.info("sample_Section is true ");
             }else
             {
             	Log.info("calender_RFS_Sev_Ses has  failed ");
             }
             Log.info("calender_RFS_Sev_Ses has passed element");
     	}catch (Exception e){
        		Log.error(" calender_RFS_Sev_Ses has fail in catch ");
        		
        		throw(e);
        		}
        	return element;
           
    }
    
    
    
    

}
