package learnTestng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotsPractice {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/");

		//file
		TakesScreenshot driver= (TakesScreenshot) driver1;
		File sourseFile =driver.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\dell\\Desktop\\newTestScreenShot\\img2.jpg");
		FileUtils.copyFile(sourseFile, destFile);
		System.out.println("ScreenShot is captured");




		Thread.sleep(2000);

		driver1	.quit();
	}
}
