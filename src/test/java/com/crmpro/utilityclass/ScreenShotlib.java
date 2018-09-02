package com.crmpro.utilityclass;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShotlib {
 public void takeScreenshot(WebDriver driver, String filename) {
	 EventFiringWebDriver efr=new EventFiringWebDriver(driver);
	 File srcfile = efr.getScreenshotAs(OutputType.FILE);
	 File destfile=new File("./src/test/resources/screenshots"+filename+".png");
	 try {
		FileUtils.copyDirectory(srcfile, destfile);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
 }
}
