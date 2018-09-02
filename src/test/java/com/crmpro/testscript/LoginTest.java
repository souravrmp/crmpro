package com.crmpro.testscript;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.crmpro.pageObject.LoginPo;
import com.crmpro.pageObject.OdooPo;
import com.crmpro.utilityclass.BaseLib;
import com.crmpro.utilityclass.ExcelUtilities;
import com.crmpro.utilityclass.WaitStatementlib;

		public class LoginTest extends BaseLib{
		@Test
		public void validLogin(){
			String name = ExcelUtilities.readData("Sheet2",1,2);
			String pass = ExcelUtilities.readData("Sheet2",1,3);
			
		     System.out.println(name);
		     System.out.println(pass);
			 LoginPo lp= new LoginPo(driver);
			 lp.loginPage(name,pass);
			 
			 OdooPo od = new OdooPo(driver);
			 WaitStatementlib.isleep(3);
			 String str=driver.getTitle();
			 String str2= ExcelUtilities.readData("Sheet2",1,4);
			 
			 Assert.assertEquals(str, str2);
			 System.out.println("Home Page Title ");
			 if(str.equals(str2)){
				 System.out.println("Home Page Title Verified");
			 }
			 else
			 {
				 System.out.println("Home Page Tile Mismatch");
			 }
			 od.crmSelect();
			 
		}
			
		    @Test(priority=2)
			public void inValidLogin(){
			String name = ExcelUtilities.readData("Sheet2",2,2);	
			String pass = ExcelUtilities.readData("Sheet2",2,3);	
		    LoginPo lp= new LoginPo(driver);
		    lp.loginPage(name, pass);
		    
		    lp.invalidConfirmation();
		    
			}
			
		}

		


