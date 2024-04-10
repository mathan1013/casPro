package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageTest 
{
  
	
		public  WebDriver driver;	
		public BasePageTest(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
}
