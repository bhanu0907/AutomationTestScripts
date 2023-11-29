package learnTestng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OldWindowPractice {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.findElement(By.className("whTextBox")).sendKeys("Bhnau Prakash");
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);

		Thread.sleep(4000);
		driver.findElement(By.id("newWindowBtn")).click();
		//driver.manage().window().maximize();
		
		//String childWindow=driver.getWindowHandle();
		//System.out.println(childWindow);
		String childWindow=" ";
		Set<String> windowId=driver.getWindowHandles();
		for (String windowHandle : windowId ) {
			if(!windowHandle.equals(parentWindow)) {
				System.out.println(windowHandle);
			//	driver.switchTo().window(windowHandle);
				driver.switchTo().window(windowHandle);
				childWindow=windowHandle;

			}
			//System.out.println(childWindow);
			//Thread.sleep(4000);
			driver.findElement(By.name("fName")).sendKeys("Bhanu");
			System.out.println(driver.findElement(By.id("malerb")).isEnabled());

			driver.switchTo().window(parentWindow);
			
			System.out.println(driver.findElement(By.id("newWindowBtn")).isDisplayed());

			
			



		}




		Thread.sleep(4000);
		driver.quit();
	}
}
