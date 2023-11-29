package learnTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.SeleniumCdpConnection;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.Select;

public class NavigetionPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://retail.onlinesbi.sbi/");
		WebElement element=driver.findElement(By.className("classicTxt"));
		System.out.println(element.isDisplayed());
		driver.navigate().refresh();

		driver.navigate().to("https://www.icicibank.com/");
		WebElement element2=driver.findElement(By.xpath("//a[@class='logo']//following-sibling::span"));
		System.out.println(element2.isDisplayed());
		driver.navigate().back();

		//		WebElement element3=	driver.findElement(By.className("btn dropdown-toggle btn-default"));
		//		element3.click();
		//		Select dropDown=new Select(element3);
		//		dropDown.selectByIndex(1);
		//		System.out.println(dropDown.getFirstSelectedOption());
		//		driver.navigate().forward();
		Thread.sleep(2000);
		WebElement element4=driver.findElement(By.id("personal_icon"));
		System.out.println(element4.isDisplayed());
		
		
		



driver.quit();
	}




}
