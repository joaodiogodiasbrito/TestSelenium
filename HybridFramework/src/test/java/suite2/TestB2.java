package suite2;

import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Utility.CommonUtils;
import Utility.Constants;
import Utility.DataProviders;
import Utility.ExcelReader;

public class TestB2 {

	
	@Test(dataProviderClass=DataProviders.class,dataProvider="getDataSuite2")
	public void testB2(Hashtable<String,String> data){
		
		ExcelReader excel = new ExcelReader(Constants.SUITE2_XL_PATH);
		CommonUtils.checkExecution("Suite2", "TestB2", data.get("RunMode"), excel);

		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://en.wikipedia.org/wiki/Main_Page");

		List<WebElement> option = web.findElements(By.tagName("a"));
		System.out.println(option.size());

		//Print all links available
		//for(int i=0; i<option.size();i++){
		//	System.out.println(option.get(i).getText());
		//				}
	}

}
		
		

