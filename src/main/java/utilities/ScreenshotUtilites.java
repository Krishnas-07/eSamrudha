package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtilites {
	public void captureScreenshotFailures(WebDriver driver, String image) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);// screenshot will store in temporary path
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());// date time capture using
																							// java
		File reportPath = new File("C:\\Users\\kudsit\\eclipse-workspace\\e_Samrudha\\src\\main\\resources\\Screenshot Failed");

		if (!reportPath.exists()) {
			reportPath.mkdir();// makedirectory
		}

		File finalDestination = new File(
				"C:\\Users\\kudsit\\eclipse-workspace\\e_Samrudha\\src\\main\\resources\\Screenshot Failed");// creating
		// a
		// location for
		// screenshot
		FileHandler.copy(screenShot, finalDestination);// to save in our system file
	}


}
