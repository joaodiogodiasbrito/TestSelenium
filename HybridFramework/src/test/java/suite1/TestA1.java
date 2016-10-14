package suite1;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.CommonUtils;
import Utility.Constants;
import Utility.DataProviders;
import Utility.ExcelReader;



public class TestA1 {
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="getDataSuite1")
	public void testA1(Hashtable<String,String> data){
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		CommonUtils.checkExecution("Suite1", "TestA1", data.get("RunMode"), excel);

		WebDriver web = new FirefoxDriver();
		web.get("http://www.gmail.com");
		web.findElement(By.id("Email")).sendKeys("jbrito.tester@gmail.com");
		web.findElement(By.id("next")).click();
		web.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		web.findElement(By.id("Passwd")).sendKeys("testselenium");
		web.findElement(By.id("signIn")).click();

	}



}
