package learnTestng;

import org.etsi.uri.x01903.v13.ClaimedRolesListType;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OldPracticeAlerts {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(5000);

		//alertBox
		WebElement alerts=driver.findElement(By.id("alertBox"));
		alerts.click();
		Alert simpleAlertBox=driver.switchTo().alert();
		System.out.println(simpleAlertBox.getText());
		simpleAlertBox.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(5000);


		//comfirm Alert
		WebElement	alerts2=driver.findElement(By.id("confirmBox"));
		alerts2.click();
		Alert simpleComfirm=driver.switchTo().alert();
		System.out.println(simpleComfirm.getText());
		simpleComfirm.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(5000);

		WebElement	alerts3=driver.findElement(By.id("confirmBox"));
		alerts3.click();
		simpleComfirm=driver.switchTo().alert();
		System.out.println(simpleComfirm.getText());
		simpleComfirm.dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(5000);

		//prompt Alert
		WebElement alerts4=driver.findElement(By.id("promptBox"));
		alerts4.click();
		Alert simplePrompt=driver.switchTo().alert();
		System.out.println(simplePrompt.getText());
		simplePrompt.sendKeys("Bhanu");
		simplePrompt.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(5000);

		WebElement alerts5=driver.findElement(By.id("promptBox"));
		alerts5.click();
		simplePrompt=driver.switchTo().alert();
		System.out.println(simplePrompt.getText());
		//simplePrompt.sendKeys("Bhanu");
		simplePrompt.dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(5000);
		driver.quit();
	}



}
