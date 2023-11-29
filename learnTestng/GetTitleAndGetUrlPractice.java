package learnTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetUrlPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		String formaltitle=new String("Frames Practice - H Y R Tutorials");
		String formalUrl="https://www.hyrtutorials.com/p/frames-practice.html";
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();


		if (formaltitle.equals(title)) {
			System.out.println("scenario1 is pass");
		}


		else {
			System.out.println("scenario1 is fail");
		}
		if (formalUrl.equals(url)) {
			System.out.println("scenario2 is pass");

		}
		else {
			System.out.println("scenario2 is fail");
		}


		//		System.out.println(title);
		//		System.out.println(url);
		//		System.out.println(formalUrl.equals(url));
		//		System.out.println(formaltitle.equals(title));
		//		System.out.println(formaltitle);
			Thread.sleep(2000);
		driver.quit();
	}

}
