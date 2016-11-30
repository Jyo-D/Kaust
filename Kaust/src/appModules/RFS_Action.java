package appModules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import pageObjects.BaseClass;
import pageObjects.LogIn_Page;
import pageObjects.New_RFS;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class RFS_Action extends BaseClass{

	public RFS_Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void cliknewRFS(int iTestCaseRow) throws Exception{
	       
    	Log.info("page loades in the browser" );
    	 
        New_RFS.clik_RFS().click();
        Log.info("Click action is performed on RFS button clicked");
        Reporter.log("RFS clic action performed ");
    }
	
	
	

	public static void frame_swich(int iTestCaseRow) throws Exception{
	       
    	Log.info("click on drop down starts" );
    	 System.out.println("RFS action swich to frame >>>>>>  ");
     //   New_RFS.selec_drop_list().click();
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 WebElement element = driver.findElement(By.xpath("//*[@id='contentFrameId']"));
 	 	 driver.switchTo().frame(element);
    	System.out.println("RFS action has swiched to frame >>>>>>  ");
       
    	Log.info("framr switch from action");
        Reporter.log("frame switch from action");
    }
	
	
	
	public static void selecet_drop(int iTestCaseRow) throws Exception{
	       
    	Log.info("click on drop down starts" );
    	 
     //   New_RFS.selec_drop_list().click();
    	
        Actions action = new Actions(driver); 
        String drp_option = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Lab_Sel);
	     System.out.println("drivers action in drop down "+(driver));
	     //New_RFS.selec_drop_list().click();
	     Thread.sleep(4000);
	     
	     action.moveToElement(New_RFS.selec_drop_list()).click().perform();
	     System.out.println("drivers action in drop down after click "+(driver));
	     Thread.sleep(4000);
	     String Analytical_Core_Lab="Analytical Core Lab";
	     if(drp_option==Analytical_Core_Lab)
	     {
	     Actions action1 = new Actions(driver); 
	     action1.moveToElement(New_RFS.drp_ana_cor_lab()).click().perform();
	     Log.info("Click on nano fabric");
	     System.out.println("drp nano fabric "+(driver));
	     }
	     Thread.sleep(5000);
	     Actions action2 = new Actions(driver); 
	     action2.moveToElement(New_RFS.btn_req_for_servi()).click().perform();
         Log.info("Click btn next button clicked");
         Reporter.log("RFS clic action performed ");
         
         
         Thread.sleep(5000);
	     Actions action3 = new Actions(driver); 
	     action3.moveToElement(New_RFS.sample_Section()).click().perform();
         Log.info("Click btn next button clicked");
         Reporter.log("RFS clic action performed ");
         
        
         
         
    }
	
	
	public static void Calender(int iTestCaseRow) throws Exception{
	       
    	Log.info("calender method starts " );
    	 
     //  click on calender icon
    	Thread.sleep(5000);
	     Actions action = new Actions(driver); 
	     action.moveToElement(New_RFS.calender_RFS_Sev_Ses_Ico()).click().perform();
        Log.info("Click btn next button clicked");
        Reporter.log("RFS clic action performed ");
        
         // click on month 
        Thread.sleep(5000);
        String sMonth = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_month);
        System.out.println("iTestCaseRow in rfs action string >>>"+iTestCaseRow);
        System.out.println(" Constant.Col_month in rfs action string >>>"+ Constant.Col_month);
        System.out.println("col 5 string >>>"+sMonth);
        int x = Integer.parseInt(sMonth);
        System.out.println("col 5 inte"+x);
      	
		String monthString;
		
	      switch (x) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
		
		
		
		

		 List<WebElement> Melements = driver.findElements(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']"));
	        System.out.println("list size" + Melements.size());
	        for (int i = 1; i < Melements.size()+1; i++) {
	            WebElement linkElement = driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']"));
	            System.out.println("list containt " + linkElement.getText());
	            
	          //*[@id="__xmlview10--reqcompdate-cal--MP"]
	            
	            String month;
	            
	       if(linkElement.getText() == monthString ){
	    	   
	    	   break;
	    	   
	       }
	       
	       else {
	    	  int month1= x; 	
	    	  
	    	   
	    	     switch (month1) {
	             case 1:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
						  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m0']")).click();
	                      break;
	             case 2:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
	             		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m1']")).click();
	                      break;
	             case 3:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m2']")).click();
	                      break;
	             case 4:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
	             		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m3']")).click();
	                      break;
	             case 5:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  	      driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m4']")).click();
	                      break;
	             case 6:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  	      driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m5']")).click();
	                      break;
	             case 7:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m6']")).click();
	                      break;
	             case 8:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m7']")).click();
	                      break;
	             case 9:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
	             		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m8']")).click();
	                      break;
	             case 10: driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
	             		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m9']")).click();
	                      break;
	             case 11: driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m10']")).click();
	                      break;
	             case 12: driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m11']")).click();
	                      break;
	             default: monthString = "Invalid month";
	                      break;
	       }
	      
	        }
        
        
        
     
        
	        }
         
    }
	
}
