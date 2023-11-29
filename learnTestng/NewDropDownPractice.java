package learnTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewDropDownPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement courseDDElement=driver.findElement(By.id("course"));
		//	Select DD=new Select(driver.findElement(By.id("course")));
		Select DD=new Select(courseDDElement);
		List<WebElement> options=DD.getOptions();
		System.out.println("Options size="+options.size());
		for (WebElement webElement : options) {
			System.out.println(webElement.getText()+"    "+webElement.getAttribute("value"));
			//		/driver.quit();	
			}

			DD.selectByVisibleText("Java");
			Thread.sleep(5000);
			DD.selectByValue("js");
			Thread.sleep(5000);
			DD.selectByIndex(0);
			//	DD.deselectByValue("js");
			//String firstSelect=DD.getFirstSelectedOption().getText();
			//	System.out.println(firstSelect);
			//System.out.println();
			System.out.println(DD.getFirstSelectedOption().getText());
			//		Thread.sleep(000);
			driver.quit();
		}}
