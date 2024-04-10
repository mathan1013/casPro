package TestCase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.GSDPageTest;
import PageObjects.OneCognizantPageTest;
import TestBase.BaseClass;

public class TC_02_WelcomeTextValidation extends BaseClass{
	
//	switching to onecognizant window and searching csd 
	
	 @Test
	 @Parameters("browser")
	  public void windowSwitch(String s) throws InterruptedException
	  {
		 logger.info("**** Starting TC_2_ValidateWelcomeMessage ****");		
			logger.debug("Application logs started......");
		 OneCognizantPageTest obj2 = new OneCognizantPageTest(driver);
			GSDPageTest obj3 = new GSDPageTest(driver);
		  try {
		  obj2.switchWindow();	 
		  obj2.serachClickGsd(s);
		  logger.info("Clicked on Search");
		  obj2.liveSupportGsdclick();
		  logger.info("Clicked on GSD");
		  obj3.frameSwitch();
	 
		  if(obj3.wtextvalidate()) {
			  Assert.assertTrue(true);
			  logger.info("Validating Welcome message");

		  }else {
			  Assert.assertFalse(true);
		  }
		  logger.info("Test Passed");
	  }catch(Exception e) {
		  logger.error("Test Failed..");
			logger.debug("Debug logs....");
		  Assert.fail();
	  }
		  logger.debug("Application logs end.......");
			logger.info("**** Finished TC_2_ValidateWelcomeMessage ****");
	  }
}
