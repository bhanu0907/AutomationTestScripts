package learnTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {
	@Test
	public void launchbrwser() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
