package learnTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldDropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(5000);

		WebElement courseName=driver.findElement(By.id("course"));

		Select courseDD=new Select(courseName);
		courseDD.selectByIndex(0);
		courseDD.selectByValue("js");
	//	courseDD.selectByVisibleText("Java");
		List<WebElement> options=courseDD.getAllSelectedOptions();

		System.out.println("optionsSize="+options.size());
		for (WebElement webElement : options) {
			System.out.println(webElement.getAttribute("Value")+"    "+webElement.getText());
		}
//		courseDD.selectByIndex(0);
//		courseDD.selectByValue("js");
//		courseDD.selectByVisibleText("Java");
//		System.out.println(courseDD.getFirstSelectedOption().getText());
		//System.out.println(courseDD.isMultiple());
	//	System.out.println(courseDD.getWrappedElement().getText());
	//	System.out.println(courseDD.getAllSelectedOptions().size());
	//	System.out.println(courseDD.getOptions().get(2));
	}

}
