package suite2;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.CommonUtils;
import Utility.Constants;
import Utility.DataProviders;
import Utility.ExcelReader;

public class TestB1 {
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="getDataSuite2")
	public void testB1(Hashtable<String,String> data){
		
		ExcelReader excel = new ExcelReader(Constants.SUITE2_XL_PATH);
		CommonUtils.checkExecution("Suite2", "TestB1", data.get("RunMode"), excel);

		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();

		web.get("http://www.gmail.com");
		web.findElement(By.id("Email")).sendKeys("jbrito.tester@gmail.com");
		web.findElement(By.id("next")).click();
		web.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		web.findElement(By.id("Passwd")).sendKeys("testselenium");
		web.findElement(By.id("signIn")).click();
		
	}

}
