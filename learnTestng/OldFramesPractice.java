package learnTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldFramesPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(5000); 
		WebElement element=driver.findElement(By.className("frmTextBox"));
		element.sendKeys("Bhanu Prakash");
		System.out.println(element.isDisplayed());

		driver.switchTo().frame("frm3");

		driver.switchTo().frame(1);
		Thread.sleep(5000); 
		WebElement courceDropDown=driver.findElement(By.xpath("//label[@class='inp']/following-sibling::select"));
//		WebElement courceDropDown=driver.findElement(By.id("course)"));
		Select Dd=new Select(courceDropDown);
		Dd.selectByIndex(2);
		System.out.println(Dd.getFirstSelectedOption());
		
		driver.switchTo().parentFrame();

		driver.switchTo().frame("frm2");
		WebElement element2=driver.findElement(By.id("lastName"));
		element2.sendKeys("yashwanth Reddy");
		System.out.println(element2.isDisplayed());
		
		driver.switchTo().parentFrame();

		driver.switchTo().frame(1);
		Dd.selectByIndex(3);
		System.out.println(Dd.getFirstSelectedOption());

		driver.switchTo().defaultContent();
		element.clear();
		element.sendKeys("reddy prakash bhanu");
		System.out.println(element.isDisplayed());




		driver.quit();
	}

}
