package learnTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroprDoenPractice {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement droupDown=driver.findElement(By.id("course"));
		Select droupD= new Select(droupDown);
		List<WebElement> options =droupD.getOptions();
		System.out.println("Options size-"+options.size());
	
		for(WebElement option:options) {
			System.out.println(option.getText()+"   "+option.getAttribute("value"));
		}
		droupD.selectByIndex(2);
		droupD.selectByValue("net");
		droupD.selectByVisibleText("python");

	}

}
