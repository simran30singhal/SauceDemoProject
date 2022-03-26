package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test
	public void LoginFailureTest() {
		
		LoginPage obj=new LoginPage();
		obj.LoginFunction("simran30","Abc1234");

		
		WebElement ErrorMsg = driver.findElement(By.xpath("//*[@data-test='error']"));
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "Epic sadface: Username and password do not match any user in this service";

		AssertJUnit.assertEquals(ActualMsg, ExpMsg);	

	}
	
	@Test
	public void LoginSuccessTest() {
		
		LoginPage obj=new LoginPage();
		obj.LoginFunction("standard_user","secret_sauce");	
		
	}
}
