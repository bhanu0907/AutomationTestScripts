package learnTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandeleButton {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
	WebElement signin=driver.findElement(By.xpath("//div[@class='position-relative mr-lg-3 d-lg-inline-block']/a"));
	signin.click();
	driver.findElement(By.tagName("input[name='login']")).sendKeys("bhanuprakash09071998@gmail.com");
driver.findElement(By.tagName("body[style='word-wrap: break-word;']")).sendKeys("Bhanu@24");
signin.submit();
	}
}
