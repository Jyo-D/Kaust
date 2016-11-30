package appModules;
import org.testng.Reporter;


import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
     
    public class SignIn_Action {
        public static void Execute(int iTestCaseRow) throws Exception{
        	       
        	Log.info("page loades in the browser" );
        	//System.out.println("read data > " +ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName));
        	
        	String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
        	
        	LogIn_Page.txtbx_UserName().sendKeys(sUserName);
            System.out.println("SignIn_Action  -----    sUserName > " +sUserName);
            Log.info(sUserName+" is entered in UserName text box" );
           
            String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
            LogIn_Page.txtbx_Password().sendKeys(sPassword);
            Log.info(sPassword+" is entered in Password text box" );
            System.out.println("SignIn_Action  -----    sPassword > " +sPassword);
            
            LogIn_Page.btn_LogIn().click();
            Log.info("Click action is performed on Submit button");
            Reporter.log("SignIn Action is successfully perfomred");
            
        }
        

        
        
    }
