package com.mycompany.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
public WebDriver driver;
	
	public WebDriver IntializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\saikiran.kudumula\\my-app\\src\\test\\java\\resources\\data.properties");
		prop.load(file);
		String browserName=prop.getProperty("browser");
		String URL=prop.getProperty("url");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\new_downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(URL);
			
		}
		else if(browserName.equals("firefox"))
		{
			
		}
		else if(browserName.equals("IE"))
		{
			
		}
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	
	}
	

	public void getScreenshot(String result) throws IOException
	{
		File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("D://Rough//"+result+"screenshot001.png"));
		
	}

}
