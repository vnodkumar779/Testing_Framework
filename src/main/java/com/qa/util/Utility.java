package com.qa.util;

import java.sql.DriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.pages.GenericFucntions;


public class Utility {
	
	public static cucumber.api.Scenario message;    

	public static void takeScreenShotAfterEveryStep() throws WebDriverException, Exception {
	        byte[] as = ((TakesScreenshot)DriverManager.getDriver(null)).getScreenshotAs(OutputType.BYTES);
	       // ((Object) message).attach(GenericFucntions.getByteScreenshot() ,"image/png", "anyname");
	    }
	}


