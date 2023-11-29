package learnTestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAlertsPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(5000);
		WebElement alerts=driver.findElement(By.id("alertBox"));
		alerts.click();
		Thread.sleep(5000);
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
