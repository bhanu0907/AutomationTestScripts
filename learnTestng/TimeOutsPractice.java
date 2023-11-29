package learnTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOutsPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		WebElement element=driver.findElement(By.id("btn1"));
//		element.click();
//		WebElement element2=driver.findElement(By.xpath("//div[@class='post-footer']//preceding::input"));
//		element2.sendKeys("Bhanu");
//		//	Thread.sleep(2000);
//		System.out.println(element2.isDisplayed());
//		
		WebElement element3=driver.findElement(By.id("btn2"));
		element3.click();
		WebElement element4=driver.findElement(By.xpath("//div[@class='post-footer']//preceding::input[1]"));
		//	System.out.println(element2.isSelected());	
			System.out.println(element4.isEnabled());	



		//div[@class='post-footer']//preceding::input
		//	Thread.sleep(2000);
		driver.quit();
	}
}
