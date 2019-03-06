package com.mycompany.app;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MainAppTest {

private static Logger log=LogManager.getLogger(MainAppTest.class.getName());
	WebDriver driver;
	
	@Test
	public void Test1() throws IOException
	{
		Base b=new Base();
		this.driver=b.IntializeDriver();
		driver.findElement(By.cssSelector("a#gb_70")).click();
		log.debug("setting chrome driver");
		
	}
	
	
	@Test(enabled=true)
	public void Test2()
	{
		System.out.println("Test2 text");
		log.info("testing test2");
		log.error("cannot locate element");
		Date d=new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}
	
	@Test
	public void Test3()
	{
		log.error("cannot locate element");
		//driver.findElement(By.xpath("abc")).click();
		
	}
	
	@AfterTest
	public void exitBrowser()
	{
		driver.close();
		log.info("browser exit");
	}
	
	
}
