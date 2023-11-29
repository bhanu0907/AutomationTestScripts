package learnTestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCheackBoxPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//Alert
		WebElement alerts=driver.findElement(By.id("alertBox"));
		alerts.click();
		//Thread.sleep(6000);
		Alert simpleAlert=	driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
	//	Thread.sleep(6000);
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.quit();
		
		
		//comfirm
		

	}
}
