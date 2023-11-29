package learnTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropdownPractice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		//day
		WebElement element=driver.findElement(By.name("birthday_day"));
		Select birthdayDate=new Select(element);

		List<WebElement> dates=birthdayDate.getOptions();
		System.out.println(dates.size());
		for (WebElement bDay : dates) {
			System.out.println(bDay.getText());
		}
		//Month
		WebElement element1=driver.findElement(By.name("birthday_month"));
		Select birthdayMonth=new Select(element1);

		List<WebElement> months=birthdayMonth.getOptions();
		System.out.println(months.size());
		for(WebElement bMonth: months) {
			System.out.println(bMonth.getText());
		}
		//year
		WebElement element3=driver.findElement(By.name("birthday_year"));
		Select birthdayYear=new Select(element3);
		
		List<WebElement> years=birthdayYear.getOptions();
		for(WebElement bYear:years ) {
			System.out.println(bYear.getText());
			
			
		}
		
		





	}

}
