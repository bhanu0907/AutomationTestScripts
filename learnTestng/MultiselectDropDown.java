package learnTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement iDe=driver.findElement(By.id("ide"));
		Select ideName=new Select(iDe);

		List<WebElement> options=ideName.getOptions();
		System.out.println("options size ="+options.size());
		for(WebElement option:options) {

			System.out.println(option.getText());
		}
		System.out.println("+++++++++");

		ideName.selectByIndex(0);
		Thread.sleep(5000);
		ideName.selectByValue("vs");
		Thread.sleep(5000);
		ideName.selectByVisibleText("IntelliJ IDEA");
		Thread.sleep(5000);

		List<WebElement> selectedOptions=ideName.getAllSelectedOptions();
		System.out.println(ideName.getAllSelectedOptions().size());
	//	System.out.println(selectedOptions.size());
		for (WebElement selectedOption : selectedOptions) {
			System.out.println(selectedOption.getText());
			
		}
		System.out.println("++++++++++");
		ideName.deselectByIndex(1);
		Thread.sleep(3000);
		ideName.deselectByVisibleText("Visual Studio");
		Thread.sleep(3000);
		ideName.deselectAll();
		Thread.sleep(3000);
		driver.quit();
	}
}