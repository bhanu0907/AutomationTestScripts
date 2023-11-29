package learnTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelPractice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("name")).sendKeys("Yashwanth");
		String parentWindow=driver.getWindowHandle();
		
		
		driver.findElement(By.className("whButtons")).click();
		


	}



}
