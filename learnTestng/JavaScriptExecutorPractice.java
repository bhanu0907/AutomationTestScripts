package learnTestng;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptExecutorPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		JavascriptExecutor driver1=(JavascriptExecutor) driver;
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		//return should be inside executeSctipt
		System.out.println(driver1.executeScript("return document.getElementsByTagName('input')[0].placeholder;"));
		
		
		driver1.executeScript("window.scrollTo(100,200)");

		Thread.sleep(3000);
		 driver1.executeScript("document.getElementById('firstName').style='background:red;border:5px solid pink';");
	//	firstNameTxt.sendKeys("Bhannu");
		

		//	System.out.println(firstNameTxt.getText());

		//	document.getElementById('firstName').style='background:yellow;border:5px solid red';

		Thread.sleep(5000);
		driver.quit();

	}

}
