package learnTestng;

import java.io.File;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotMethod extends ScreenShotsPractice {

	public static void captureScreen() {
		TakesScreenshot screen=new ChromeDriver();
		File file=screen.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("C:\\Users\\dell\\Desktop\\newTestScreenShot\\img2.jpg");
	}
}
