package learnTestng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement element=driver.findElement(By.id("name"));
		element.sendKeys("Bhanu");
		Thread.sleep(3000);
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		System.out.println(driver.getTitle());
		//Thread.sleep(4000);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(4000);
		System.out.println("+++++++++++++++++");
		Set<String> windowHandles=driver.getWindowHandles();
		String childWindow="";
		for (String windowId : windowHandles) {
			if (!windowId.equals(parentWindow)) {
				System.out.println(windowId);
				driver.switchTo().window(windowId);
				//childWindow=windowId;
			}

		}
		childWindow=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("fName")).sendKeys("Prakash Bhanu");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("name")).sendKeys("prakash");
		Thread.sleep(3000);

		driver.switchTo().window(childWindow);
		driver.findElement(By.id("lastName")).sendKeys("Reddy Prakash Bhanu");


		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("princeeee");
		System.out.println(driver.findElement(By.className("whTextBox")).isDisplayed());

		driver.switchTo().window(childWindow);
		driver.findElement(By.id("femalerb")).click();
		System.out.println(driver.findElement(By.id("femalerb")).isSelected());

		Thread.sleep(5000);
		driver.quit();

	}

}
