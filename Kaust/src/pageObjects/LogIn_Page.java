package pageObjects;
        import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;
    public class LogIn_Page extends BaseClass {
    	
    	static FileInputStream file;
    	static Properties prop;
    	static WebDriverWait wait = new WebDriverWait(driver, 500);
    	
           private static WebElement element = null;
           
        
        public LogIn_Page(WebDriver driver){
            	super(driver);
            	
        }     
        public static WebElement txtbx_UserName() throws Exception{
        	try{
        		prop=new Properties();
        		file=new FileInputStream("D://Incture//Selenium//FD_Test//Kaust//src//OR//xpath.properties");
        		prop.load(file);
        		System.out.println("driver value from Utils txtbox - " + driver );
        		System.out.println("wait value  from Utils txtbox - " + driver );
        		System.out.println("load prop files " );
	            element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("uid"))));
	             
				
				boolean status = true;
				if(element.isDisplayed() && element.isEnabled() == status)
	            {
	            System.out.println(element.isDisplayed());
	            Log.info("Username displayed is true ");
	            Log.info("Username Enabled  is true ");
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
        
        public static WebElement txtbx_Password() throws Exception{
        	try{
	        	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("pwd"))));
	            Log.info("Password text box is found on the Login page");
        	}catch (Exception e){
        		Log.error("Password text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_LogIn() throws Exception{
        	try{
	        	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("sinin"))));
	            Log.info("Submit button is found on the Login page");
        	}catch (Exception e){
        		Log.error("Submit button is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_nxt() throws Exception{
        	try{
	        	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("next")));
	            Log.info("next button is found on the Login page");
        	}catch (Exception e){
        		Log.error("next button is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
 
    }
