package suite1;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.CommonUtils;
import Utility.Constants;
import Utility.DataProviders;
import Utility.ExcelReader;

public class TestA2 {

	@Test(dataProviderClass=DataProviders.class,dataProvider="getDataSuite1")
	public void testA2(Hashtable<String,String> data){
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		CommonUtils.checkExecution("Suite1", "TestA2", data.get("RunMode"), excel);

		WebDriver web = new FirefoxDriver();
		web.get("https://en.wikipedia.org/wiki/Main_Page");

		List <WebElement> option = web.findElements(By.tagName("a"));
		System.out.println(option.size());

			//Print all links available
		//for(int i=0; i<option.size();i++){
		//	System.out.println(option.get(i).getText());
		//				}
				}

			}