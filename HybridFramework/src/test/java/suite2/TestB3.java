package suite2;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Utility.CommonUtils;
import Utility.Constants;
import Utility.DataProviders;
import Utility.ExcelReader;

public class TestB3 {

	
	
	@Test
	public void testB3(){
		
	//	ExcelReader excel = new ExcelReader(Constants.SUITE2_XL_PATH);
	//	CommonUtils.checkExecution("Suite2", "TestB3", data.get("RunMode"), excel);

		WebDriver web = new FirefoxDriver();
		web.get("http://www.gmail.com");
		web.findElement(By.id("Email")).sendKeys("joaodiogobrito@gmail.com");
		web.findElement(By.id("next")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		web.findElement(By.id("Passwd")).sendKeys("njkdnkdf");
		web.close();
		
	}
}
